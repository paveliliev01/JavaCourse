package exercises.service;

import exercises.location.Location;
import exercises.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RentalService implements RentalServiceAPI {
    List<Vehicle> vehicles = new ArrayList<>();


    /**
     * Rents an available vehicle until a certain point in time
     *
     * @param vehicle a valid vehicle registered with the RentalService
     * @param until   point in time until which the vehicle will be rented.
     *                The vehicle will be available for next booking after @until
     * @return the price of the trip (starting now).
     * If the vehicle does not exist or is already booked, return -1.0
     */

    public double rentUntil(Vehicle vehicle, LocalDateTime until) {
        if (!vehicles.contains(vehicle)) {
            return 0;
        }
        vehicle.setStartOfReservation(LocalDateTime.now());
        vehicle.setEndOfReservationPeriod(until);
        return vehicle.finalPrice(vehicle.getStart(),vehicle.getEndOfReservationPeriod());
    }

    /**
     * Returns the nearest available vehicle of the specified type within a certain radius
     * of the given location
     *
     * @param type        the type of the vehicle
     * @param location    current location
     * @param maxDistance non-negative maximum distance to the vehicle
     * @return the nearest available vehicle of the specified @type within @maxDistance, null otherwise.
     * If there are two or more equidistant nearest vehicles, return any of them
     */
    @Override
    public Vehicle findNearestAvailableVehicleInRadius(String type, Location location, double maxDistance) {
        int indexOfVehicle = 0;
        double minPath = 0;
        int lastIndex = 0;
        boolean isFirstVehicle = true;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals(type)) {
                double path =  Math.sqrt(Math.pow((vehicle.getLocation().getX()-location.getX()),2) - Math.pow((vehicle.getLocation().getY()-location.getY()),2));
                if (isFirstVehicle){
                    indexOfVehicle = vehicles.indexOf(vehicle);
                    minPath = path;
                    isFirstVehicle = false;
                    continue;
                }
                if (path < minPath){
                    lastIndex = indexOfVehicle;
                    indexOfVehicle = vehicles.indexOf(vehicle);
                    minPath = path;
                    if (minPath > maxDistance){
                        indexOfVehicle = lastIndex;
                    }
                }
            }


        }
        return vehicles.get(indexOfVehicle);
    }

    public void addVehiclesToRentalService(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}


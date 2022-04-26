package exercises;

import exercises.location.Location;
import exercises.service.RentalService;
import exercises.vehicle.Car;
import exercises.vehicle.Vehicle;
import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();
        Vehicle vw = new Car("1", new Location(1, 1));
        Vehicle audi = new Car("1", new Location(2, 5));
        rentalService.addVehiclesToRentalService(vw);
        rentalService.addVehiclesToRentalService(audi);
    }
}

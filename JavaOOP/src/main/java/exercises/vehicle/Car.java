package exercises.vehicle;

import exercises.location.Location;

import java.time.LocalDateTime;

public class Car extends AbstractVehicle {
    private static final String TYPE = "CAR";
    private static final double PRICE_PER_MINUTE = 0.5;

    public Car(String id, Location location) {
        super(location, TYPE, id, PRICE_PER_MINUTE);
    }

}

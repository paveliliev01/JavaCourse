package exercises.vehicle;

import exercises.location.Location;

public class Scooter extends AbstractVehicle {
    private static final String TYPE = "SCOOTER";
    private static final double PRICE_PER_MINUTE = 0.3;

    public Scooter(Location location, String type, String id, double pricePerMinute) {
        super(location, type, id, pricePerMinute);
    }
}

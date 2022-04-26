package exercises.vehicle;

import exercises.location.Location;

public class Bicycle extends AbstractVehicle{
    private static final String TYPE = "BICYCLE";
    private static final double PRICE_PER_MINUTE = 0.2;

    public Bicycle(Location location, String type, String id, double pricePerMinute) {
        super(location, type, id, pricePerMinute);
    }
}

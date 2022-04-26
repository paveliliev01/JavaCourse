package exercises.vehicle;

import exercises.location.Location;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AbstractVehicle implements Vehicle {
    private final String type;
    private final String id;
    private final double pricePerMinute;
    private Location location;
    private LocalDateTime endOfReservationPeriod;
    private LocalDateTime startOfReservation;

    public AbstractVehicle(Location location, String type, String id, double pricePerMinute) {
        this.location = location;//location == null ? new Location(0,0) : location;
        this.type = type;
        this.id = id;
        this.pricePerMinute = pricePerMinute;
        this.endOfReservationPeriod = null;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPricePerMinute() {
        return pricePerMinute;
    }

    public LocalDateTime getEndOfReservationPeriod() {
        return endOfReservationPeriod != null ? endOfReservationPeriod : LocalDateTime.now();
    }

    public void setEndOfReservationPeriod(LocalDateTime endOfReservationPeriod) {
        this.endOfReservationPeriod = endOfReservationPeriod;
    }

    @Override
    public void setStartOfReservation(LocalDateTime startOfReservation) {
        this.startOfReservation = startOfReservation;
    }

    @Override
    public LocalDateTime getStart() {
        return startOfReservation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }

        AbstractVehicle v = (AbstractVehicle) o;
        return this.getId().equals(v.getId());
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }

    @Override
    public double finalPrice(LocalDateTime start, LocalDateTime to){
          double time = ChronoUnit.MINUTES.between(start,to);
          return time * pricePerMinute;
    }
}
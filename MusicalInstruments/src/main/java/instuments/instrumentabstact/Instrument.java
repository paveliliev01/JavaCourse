package instuments.instrumentabstact;

import instuments.classes.Type;

public abstract class Instrument {
    private final String instrumentName;
    private final double price;
    private boolean isAvailable;
    private final Type type;


    protected Instrument(String instrumentName, double price, Type type) {
        this.instrumentName = instrumentName;
        this.price = price;
        this.type = type;
        this.isAvailable = true;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void getType() {
        System.out.println(type);
    }
}

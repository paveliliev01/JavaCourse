package instuments.instruments;

import instuments.classes.Type;
import instuments.instrumentabstact.Instrument;

public class ElectroAbstract extends Instrument {

    protected ElectroAbstract(String instrumentName, double price, Type type) {
        super(instrumentName, price, type);
    }
}

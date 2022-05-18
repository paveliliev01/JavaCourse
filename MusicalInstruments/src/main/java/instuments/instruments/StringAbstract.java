package instuments.instruments;

import instuments.classes.Type;
import instuments.instrumentabstact.Instrument;

public class StringAbstract extends Instrument {

    protected StringAbstract(String instrumentName, double price, Type type) {
        super(instrumentName, price, type);
    }
}

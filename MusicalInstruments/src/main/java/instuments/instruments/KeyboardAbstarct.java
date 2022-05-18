package instuments.instruments;

import instuments.classes.Type;
import instuments.instrumentabstact.Instrument;

public class KeyboardAbstarct extends Instrument {

    protected KeyboardAbstarct(String instrumentName, double price, Type type) {
        super(instrumentName, price, type);
    }
}

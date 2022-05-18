package instuments.instruments;

import instuments.classes.Type;
import instuments.instrumentabstact.Instrument;

public class DrumAbstract extends Instrument{
    protected DrumAbstract(String instrumentName, double price, Type type) {
        super(instrumentName, price, type);
    }
}

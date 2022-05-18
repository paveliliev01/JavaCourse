package instuments.classes.drum;

import instuments.classes.Type;
import instuments.instruments.DrumAbstract;

public class Drums extends DrumAbstract {

    protected Drums(String instrumentName, double price, Type type) {
        super(instrumentName, price,type);
    }
}

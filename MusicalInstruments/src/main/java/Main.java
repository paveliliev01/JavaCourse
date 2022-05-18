import instuments.classes.Type;
import instuments.classes.electro.Synthesizer;
import instuments.classes.keyboard.Piano;
import instuments.classes.strings.Guitar;
import instuments.instrumentabstact.Instrument;
import shop.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Instrument guitar = new Guitar("Guitar", 5, Type.STRINGS);
        Instrument guitar1 = new Guitar("Gaitar",5,Type.STRINGS);
        Instrument piano = new Piano("Piano", 8,Type.KEYBOARD);
        Instrument piano1 = new Piano("Piano111", 1,Type.KEYBOARD);
        Instrument instrument = new Synthesizer("Synt", 9, Type.ELECTRO);
        Instrument instrument1 = new Piano("Gosho", 3,Type.KEYBOARD);
        Instrument instrument2 = new Piano("Tosho", 54,Type.KEYBOARD);



        shop.addInstrument(guitar,6);
        shop.addInstrument(guitar1,1);
        shop.addInstrument(piano,4);
        shop.addInstrument(piano1,2);
        shop.addInstrument(instrument,7);
        shop.addInstrument(instrument2,9);
        shop.addInstrument(piano1,12);
        shop.addInstrument(piano1,12);
        shop.getListOfInstruments();




    }

}

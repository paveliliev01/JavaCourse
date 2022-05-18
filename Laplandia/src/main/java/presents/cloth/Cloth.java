package presents.cloth;

import child.Child;
import presents.Present;
import presents.PresentType;

import java.util.Random;

import static java.time.chrono.JapaneseEra.values;

public class Cloth extends Present {
    public enum clothSize{
        L,M,S,XL,XS
    }

    private final Random random = new Random();
    private final clothSize size;

    public Cloth(Child child) {
        super(child);
        this.size =  clothSize.values()[random.nextInt(values().length)];
        price(2,12);
        presentType = PresentType.CLOTH;
    }


    public clothSize getSize() {
        return size;
    }
    public String aa(){
        return "aa";
    }
}

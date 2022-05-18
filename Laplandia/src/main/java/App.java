import child.Child;
import presents.Present;
import presents.PresentType;
import presents.cloth.Cloth;
import presents.doll.Doll;
import train.Train;

import java.util.Random;

import static java.time.chrono.JapaneseEra.values;

public class App {
    public static final Random random = new Random();
    private enum clothSize{
        L,M,S,XL,LA
    }
    public static  Cloth.clothSize size = Cloth.clothSize.values()[random.nextInt(values().length)];
    public static void main(String[] args) {


    }
}

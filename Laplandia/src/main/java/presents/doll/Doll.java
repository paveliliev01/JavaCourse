package presents.doll;

import child.Child;
import presents.Present;
import presents.PresentType;

import static java.time.chrono.JapaneseEra.values;

public class Doll extends Present {

    private final int[] size = new int[2];
    private hairColor hair;
    private enum hairColor{
        BLONDE,
        BLACK,
        BROWN
    }

    public Doll(Child child) {
        super(child);
        price(5,11);
        for (int i = 0; i <= 1; i++) {
            if (i == 0){
                size[0] = random.nextInt(61 - 0);
            }else if(i == 1){
                size[1] = random.nextInt(41 - 0);
            }
        }
        this.hair = hairColor.values()[random.nextInt(values().length - 2)];
        presentType = PresentType.DOLL;
    }

    public int[] size(){
        return size;
    }


}

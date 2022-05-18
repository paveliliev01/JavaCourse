package presents;

import child.Child;
import presents.cloth.Cloth;

import java.util.Random;

import static java.time.chrono.JapaneseEra.values;

public abstract class Present {
    public final Random random = new Random();
    public enum colorOfWrapper{
        RED,
        GREEN,
        WHITE,
        BLUE,
    }
    private colorOfWrapper colorWrapper;
    private Child child;
    private int price;
    protected PresentType presentType;

    public Present(Child child) {
        this.colorWrapper = colorOfWrapper.values()[random.nextInt(values().length - 1)];
        this.child = child;

    }

    public int getPrice() {
        return price;
    }

    protected int price(int low,int high){
        this.price = randomBetweenTwo(low,high);
        return price;
    }

    protected int randomBetweenTwo(int low, int high){
        return random.nextInt(high - low) + low;
    }

    public colorOfWrapper getColorWrapper() {
        return colorWrapper;
    }

    public PresentType getPresentType() {
        return presentType;
    }
}

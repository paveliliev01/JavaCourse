package presents.car;

import child.Child;
import presents.Present;
import presents.PresentType;

public class Car extends Present {
    private int batteryCapacity;
    public Car(Child child) {
        super(child);
        presentType = PresentType.CAR;
        price(20,40);
        this.batteryCapacity = randomBetweenTwo(2,7);
    }
}

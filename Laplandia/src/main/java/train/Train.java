package train;

import child.Child;
import presents.Present;
import presents.PresentType;

public class Train extends Present {
    private boolean hasSmoke;
    public Train(Child child, boolean hasSmoke) {
        super(child);
        presentType = PresentType.TRAIN;
        this.hasSmoke = hasSmoke;
        price(15,31);
    }
}

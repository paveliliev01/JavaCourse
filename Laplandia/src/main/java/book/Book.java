package book;

import child.Child;
import presents.Present;

public class Book extends Present {

    private String name;
    private int fairyTales;

    public Book(Child child, String name) {
        super(child);
        this.name = name;
        this.fairyTales = randomBetweenTwo(1,6);
    }
}

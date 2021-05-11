package taskReadingAndWriting;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private boolean edible;

    public Animal(String name, boolean edible) {
        this.name = name;
        this.edible = edible;
    }

}

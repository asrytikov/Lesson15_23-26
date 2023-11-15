package p6;

import java.io.Serializable;

public class People implements Serializable {

    private String name;
    private int age;
    private transient double height;
    private transient boolean married;

    public People(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}

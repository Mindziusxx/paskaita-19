package example7;

public class Person {

    private String name;
    private String height;

    public void setHeight(String height) {
        this.height = height;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getHeight() {

        return height;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}

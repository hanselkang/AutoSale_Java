package components;

public abstract class Component {

    String name;
    double price;

    public Component(String name, double price) {
        this.name = name;
        this.price = price;
    }

}

package components;

public class Gearbox extends Component{
    private String transmission;
    private int numberOfGears;

    public Gearbox(String name, double price, String transmission, int numberOfGears) {
        super(name, price);
        this.transmission = transmission;
        this.numberOfGears = numberOfGears;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public int getNumberOfGears() {
        return this.numberOfGears;
    }
}

package components;

public class Tyre extends Component{
    private int quantity;
    private int size;

    public Tyre(String name, double price, int quantity, int size) {
        super(name, price);
        this.quantity = quantity;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getSize() {
        return this.size;
    }
}

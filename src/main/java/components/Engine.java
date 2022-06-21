package components;

public class Engine extends Component {
    private int HP;

    public Engine(String name, double price, int HP) {
        super(name, price);
        this.HP = HP;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getHP() {
        return this.HP;
    }
}

import java.util.ArrayList;

public class Dealership {
    private String name;
    private double money;
    private ArrayList<Vehicle> DealershipVehicles;

    public Dealership(String name, double money) {
        this.name = name;
        this.money = money;
        this.DealershipVehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getDealershipVehicles() {
        return DealershipVehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.DealershipVehicles.add(vehicle);
    }


}


import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Vehicle> vehicles;
    private Customer customer;


    public Customer(double money) {
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public int getNumberOfVehicles() {
        return vehicles.size();
    }


    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }


    public void buyVehicle(Vehicle vehicle, Dealership dealership) {
        if (vehicle.getPrice() <= this.money) {
            this.money -= vehicle.getPrice();
            vehicles.add(vehicle);
            dealership.money += vehicle.getPrice();
        }


    }
}
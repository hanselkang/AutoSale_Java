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


    public boolean affordVehicle(Vehicle vehicle) {
        if (vehicle.getPrice() <= customer.getMoney()){
            return true;
        } else {
            return false;
        }
    }

    public void buyVehicle(Vehicle vehicle) {

        if (affordVehicle(vehicle)==true) {
            money -= vehicle.getPrice();
            vehicles.add(vehicle);
     }
    }
}

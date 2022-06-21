public class Vehicle {

    private String make;
    private String model;
    private double price;

    private VehicleType vehicleType;

    private String colour;

    public Vehicle(String make, String model, double price, VehicleType vehicleType, String colour) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.vehicleType = vehicleType;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public VehicleType getType() {
        return vehicleType;
    }

    public String getColour() {
        return colour;
    }
}

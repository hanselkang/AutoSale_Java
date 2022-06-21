import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer1;
    Vehicle vehicle1;

    Vehicle vehicle2;
    @Before
    public void before(){

        customer1 = new Customer(50000);
        vehicle1 = new Vehicle("VW","Golf",12000,VehicleType.CAR,"Red")   ;
        vehicle2 = new Vehicle("Ford","Fiest", 10000, VehicleType.VAN, "Blue");


    }

    @Test
    public void hasMoney() {
        assertEquals(50000, customer1.getMoney(),0.0);
    }

    @Test
    public void hasNumberOfVehicles() {
        customer1.addVehicle(vehicle1);
        customer1.addVehicle(vehicle2);
        assertEquals(2,customer1.getNumberOfVehicles());
    }

//    @Test
//    public void customerAffordVehicle() {
//        assertEquals(true, customer1.affordVehicle(vehicle2));
//    }

    @Test
    public void customerCanBuyVehicle() {
        customer1.addVehicle(vehicle1);
        customer1.buyVehicle(vehicle2);
        assertEquals(2,customer1.getNumberOfVehicles());
        assertEquals(40000,customer1.getMoney(),0.0);
    }
}
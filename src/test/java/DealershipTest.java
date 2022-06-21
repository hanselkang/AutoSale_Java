import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealershipTest {

    Dealership dealership1;
    Vehicle vehicle1;
    Vehicle vehicle2;

    @Before
    public void before(){
        dealership1 = new Dealership("HANDY AUTO",3000000);
        vehicle1 = new Vehicle("VW","Golf",12000,VehicleType.CAR,"Red")   ;
        vehicle2 = new Vehicle("Ford","Fiest", 10000, VehicleType.VAN, "Blue");

    }


    @Test
    public void getName() {
        assertEquals("HANDY AUTO", dealership1.getName());
    }

    @Test
    public void getMoney() {
        assertEquals(3000000, dealership1.getMoney(),0.0);
    }

    @Test
    public void getDealershipVehicles() {
        dealership1.addVehicle(vehicle1);
        dealership1.addVehicle(vehicle2);
        assertEquals(2,dealership1.getDealershipVehicles());
    }


}
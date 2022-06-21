import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    Vehicle vehicle1;

    @Before
    public void before(){
        vehicle1 = new Vehicle("Ford","Fiesta",10000,VehicleType.CAR,"Blue");
    }

    @Test
    public void hasMake(){
        assertEquals("Ford",vehicle1.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Fiesta",vehicle1.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(10000,vehicle1.getPrice(),0.0);
    }
    @Test
    public void hasVehicleType(){
        assertEquals(VehicleType.CAR,vehicle1.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", vehicle1.getColour());
    }
}
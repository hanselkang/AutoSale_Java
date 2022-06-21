package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GearboxTest{

    Gearbox gearbox1;

    @Before
    public void before(){
        gearbox1 = new Gearbox("Helical",7000,"Automatic",8);

    }

    @Test
    public void hasName(){
        assertEquals("Helical",gearbox1.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(7000, gearbox1.getPrice(),0.0);
    }

    @Test
    public void hasTransmission(){
        assertEquals("Automatic", gearbox1.getTransmission());
    }

    @Test
    public void hasNumberOfGears(){
        assertEquals(8,gearbox1.getNumberOfGears());
    }

}
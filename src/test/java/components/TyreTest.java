package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TyreTest {
    Tyre tyre1;

    @Before
    public void before(){
        tyre1 = new Tyre("Continental",154,1,22);
    }

    @Test
    public void hasName(){
        assertEquals("Continental", tyre1.getName());
    }

    @Test
    public void hasQuantity(){
        assertEquals(1,tyre1.getQuantity());
    }

    @Test
    public void getSize() {
        assertEquals(22,tyre1.getSize());
    }
}
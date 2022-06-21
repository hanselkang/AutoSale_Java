package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    Engine engine1;

    @Before
    public void before(){
        engine1 = new Engine("VW TDI2.0",5000,200);
    }

    @Test
    public void hasName() {
        assertEquals("VW TDI2.0", engine1.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(5000, engine1.getPrice(),0.0);
    }

    @Test
    public void hasHP() {
        assertEquals(200, engine1.getHP());
    }
}
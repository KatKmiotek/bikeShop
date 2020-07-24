package shop.components;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrameTest {
    Frame frame;
    @Before
    public void before(){
        frame = new Frame("Cinelli", 52, "carbon", "road", "red", 200);
    }


    @Test
    public void getMaterial() {
        assertEquals("carbon", frame.getMaterial());
    }

    @Test
    public void getMake() {
        assertEquals("Cinelli", frame.getMake());
    }
}
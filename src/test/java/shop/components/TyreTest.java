package shop.components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TyreTest {
    Tyre tyre;
    @Before
    public void before(){
        tyre = new Tyre("Michellin", 700, 23, 10);
    }
    @Test
    public void hasSize(){
        assertEquals(700, tyre.getSize());
    }
}
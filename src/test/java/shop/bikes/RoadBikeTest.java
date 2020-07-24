package shop.bikes;

import shop.components.Crankset;
import shop.components.Frame;
import shop.components.Tyre;
import shop.components.Wheel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoadBikeTest {
    RoadBike roadBike;
    Frame frame;
    Crankset crankset;
    Tyre tyre;
    Wheel wheel;
    @Before
    public void before(){
        frame = new Frame("Cinelli", 52, "carbon", "road", "red", 300);
        crankset = new Crankset("Shimano", 46, 30);
        roadBike = new RoadBike(frame, crankset, 0);
        tyre = new Tyre("Michellin", 700, 23, 15);
        wheel = new Wheel("Mavic", 23, 100);
    }
    @Test
    public void canAddTyre(){
        roadBike.addTyre(tyre);
        assertEquals(1, roadBike.tyresCount());
    }
    @Test
    public void CantAddTyre(){
        roadBike.addTyre(tyre);
        roadBike.addTyre(tyre);
        roadBike.addTyre(tyre);
        roadBike.addTyre(tyre);
        roadBike.addTyre(tyre);
        assertEquals(4, roadBike.tyresCount());
    }
    @Test
    public void canCalculatePrice(){
        roadBike.addTyre(tyre);
        roadBike.addTyre(tyre);
        roadBike.addTyre(tyre);
        roadBike.addTyre(tyre);
        roadBike.addWheel(wheel);
        roadBike.addWheel(wheel);
        roadBike.addWheel(wheel);
        roadBike.addWheel(wheel);
        roadBike.calculatePrice();
        assertEquals(790, roadBike.getPrice());
    }
}
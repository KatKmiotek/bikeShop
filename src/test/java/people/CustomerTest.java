package people;

import org.junit.Before;
import org.junit.Test;
import shop.bikes.RoadBike;
import shop.components.Crankset;
import shop.components.Frame;
import shop.components.Tyre;
import shop.components.Wheel;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;
    Frame frame;
    Crankset crankset;
    RoadBike roadBike;
    Tyre tyre;
    Wheel wheel;
    @Before
    public void before(){
        customer = new Customer("Kat", 1000);
        frame = new Frame("Cinelli", 52, "carbon", "road", "red", 300);
        crankset = new Crankset("Shimano", 46, 30);
        roadBike = new RoadBike(frame, crankset, 0, "road");
        tyre = new Tyre("Michellin", 700, 23, 15);
        wheel = new Wheel("Mavic", 23, 100);
    }
    @Test
    public void canAddToBasket(){
        customer.addToBasket(frame);
        customer.addToBasket(roadBike);
        assertEquals(2, customer.basketCount());
    }
    @Test
    public void canBuy(){
        customer.addToBasket(frame);
        customer.buy(frame);
        assertEquals(700, customer.getWallet());
        assertEquals("I cycle on road bike, I am free!", roadBike.cycle());
    }
}
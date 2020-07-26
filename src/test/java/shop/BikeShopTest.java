package shop;

import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Staff;
import shop.bikes.Bike;
import shop.bikes.RoadBike;
import shop.components.Crankset;
import shop.components.Frame;
import shop.components.Tyre;
import shop.components.Wheel;

import static org.junit.Assert.*;

public class BikeShopTest {
    Customer customer;
    Staff staff;
    Frame frame;
    Crankset crankset;
    RoadBike roadBike;
    Tyre tyre;
    Wheel wheel;
    BikeShop bikeShop;

    @Before
    public void before(){
        bikeShop = new BikeShop(staff, customer, 10000);
        customer = new Customer("Kat", 1000);
        staff = new Staff("Kyle");
        frame = new Frame("Cinelli", 52, "carbon", "road", "red", 300);
        crankset = new Crankset("Shimano", 46, 30);
        roadBike = new RoadBike(frame, crankset, 0, "road");
        tyre = new Tyre("Michellin", 700, 23, 15);
        wheel = new Wheel("Mavic", 23, 100);
    }
    @Test
    public void canBuy() {
        bikeShop.buy(roadBike);
        bikeShop.buy(tyre);
        assertEquals(1, bikeShop.stockCount());
        assertEquals(1, bikeShop.bikesCount());
    }

    @Test
    public void canSell() {
        bikeShop.buy(tyre);
        bikeShop.buy(frame);
        bikeShop.sell(tyre, customer);
        assertEquals(1, customer.collectionCount());
        assertEquals(985, customer.getWallet());
        assertEquals(10015, bikeShop.getTill());
        assertEquals(1, bikeShop.stockCount());
    }
}
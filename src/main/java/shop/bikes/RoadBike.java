package shop.bikes;

import shop.components.Crankset;
import shop.components.Frame;

public class RoadBike extends Bike {
    public RoadBike(Frame frame, Crankset crankset, int price, String type) {
        super(frame, crankset, price, type);
    }
}

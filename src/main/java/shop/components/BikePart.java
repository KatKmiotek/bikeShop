package shop.components;

import shop.Product;

public abstract class BikePart extends Product {
    private String make;
    private int size;

    public BikePart(String make, int size, int price) {
        super(price);
        this.make = make;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public int getSize() {
        return size;
    }
}

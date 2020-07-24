package shop.components;

public class Tyre extends BikePart {
    private int width;
    public Tyre(String make, int size, int width, int price) {
        super(make, size, price);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}

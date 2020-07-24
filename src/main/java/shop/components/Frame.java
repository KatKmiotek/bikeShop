package shop.components;

public class Frame extends BikePart {
    private String material;
    private String type;
    private String colour;
    public Frame(String make, int size, String material, String type, String colour, int price) {
        super(make, size, price);
        this.material = material;
        this.type = type;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }
}

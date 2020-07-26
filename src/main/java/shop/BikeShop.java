package shop;

import behaviours.IBuy;
import behaviours.ISell;
import shop.bikes.Bike;
import people.Customer;
import people.Staff;
import shop.components.BikePart;

import java.util.ArrayList;

public class BikeShop implements IBuy, ISell {
    private ArrayList<Product> bikes;
    private Staff staff;
    private Customer customer;
    private int till;
    private ArrayList<Product> stock;

    public BikeShop(Staff staff, Customer customer, int till) {
        this.staff = staff;
        this.customer = customer;
        this.till = till;
        this.bikes = new ArrayList<Product>();
        this.stock = new ArrayList<Product>();
    }

    public void setBikes(ArrayList<Product> bikes) {
        this.bikes = bikes;
    }

    public ArrayList<Product> getBikes() {
        return bikes;
    }

    public Staff getStaff() {
        return staff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Product> stock) {
        this.stock = stock;
    }

    @Override
    public void buy(Product product) {
        if (product instanceof Bike) {
            bikes.add(product);
        } else if(product instanceof BikePart){
            stock.add(product);
        }
    }

    @Override
    public void sell(Product product, Customer customer) {
        customer.buy(product);
        customer.wallet -= product.getPrice();
        till += product.getPrice();
        if(product instanceof Bike == true){
            bikes.remove(product);
        }
        stock.remove(product);

    }

    public int stockCount() {
        return stock.size();
    }
    public int bikesCount(){
        return bikes.size();
    }
}

package shop;

import shop.bikes.Bike;
import people.Customer;
import people.Staff;

import java.util.ArrayList;

public class BikeShop {
    private ArrayList<Bike> bikes;
    private Staff staff;
    private Customer customer;
    private int till;

    public BikeShop(Staff staff, Customer customer, int till) {
        this.staff = staff;
        this.customer = customer;
        this.till = till;
        this.bikes = new ArrayList<Bike>();
    }

    public void setBikes(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }

    public ArrayList<Bike> getBikes() {
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
}

package people;

import behaviours.ITransact;
import shop.Product;

import java.util.ArrayList;

public class Customer extends Person implements ITransact {
    private int wallet;
    private ArrayList<Product> basket;
    public Customer(String name, int wallet) {
        super(name);
        this.wallet = wallet;
        this.basket = new ArrayList<Product>();
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Product> basket) {
        this.basket = basket;
    }
    public int basketCount(){
        return basket.size();
    }
    public void addToBasket(Product product){
        basket.add(product);
    }

    @Override
    public void buy() {
        int total = 0;
        for(Product product : basket){
            total += product.getPrice();
        }
        wallet -= total;
    }

    @Override
    public void sell() {

    }
}

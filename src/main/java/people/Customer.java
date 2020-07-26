package people;

import behaviours.IBuy;
import shop.Product;

import java.util.ArrayList;

public class Customer extends Person implements IBuy {
    public int wallet;
    private ArrayList<Product> basket;
    private ArrayList<Product> collection;
    public Customer(String name, int wallet) {
        super(name);
        this.wallet = wallet;
        this.basket = new ArrayList<Product>();
        this.collection = new ArrayList<Product>();

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

    public ArrayList<Product> getCollection() {
        return collection;
    }

    public int collectionCount(){
        return collection.size();
    }

    @Override
    public void buy(Product product) {
        collection.add(product);
        int total = 0;
        for(Product productInBasket : basket){
            total += productInBasket.getPrice();
        }
        wallet -= total;
    }


}

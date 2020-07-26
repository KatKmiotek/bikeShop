package behaviours;

import people.Customer;
import shop.Product;

public interface ISell {
    public void sell(Product product, Customer customer);
}

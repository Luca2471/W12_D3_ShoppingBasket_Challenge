import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Product> shoppingBasket;

    public ShoppingBasket() {
        this.shoppingBasket = new ArrayList<Product>();
    }

    public int getNumberOfProducts() {
        return shoppingBasket.size();
    }

    public void addProduct(Product product) {
        shoppingBasket.add(product);
    }

    public void removeProduct(Product product) {
        shoppingBasket.remove(product);
    }

    public void clearBasket() {
        shoppingBasket.clear();
    }

}

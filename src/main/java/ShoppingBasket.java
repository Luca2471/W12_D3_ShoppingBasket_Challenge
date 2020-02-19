import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Product> products;

    public ShoppingBasket() {
        this.products = new ArrayList<Product>();
    }

    public int getNumberOfProducts() {
        return products.size();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void clearBasket() {
        products.clear();
    }

    public double getTotalCost() {
        int total = 0;
        for (Product product : products ) {
             total += product.getPrice();
        }
        return total;
    }

    public double getTenPercentDiscount(ShoppingBasket shoppingBasket) {
        double total = 0;
        if (shoppingBasket.getTotalCost() > 20) {
            total *= 0.10;
        }
        return total;
    }



}

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Product product;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        product = new Product("Eggs", 5.50);
    }

    @Test
    public void ShoppingBasketStartsEmpty() {
        assertEquals(0, shoppingBasket.getNumberOfProducts());
    }

    @Test
    public void canAddproductToShoppingBasket() {
        shoppingBasket.addProduct(product);
        assertEquals(1, shoppingBasket.getNumberOfProducts());
    }

    @Test
    public void canRemoveFromShoppingBasket() {
        shoppingBasket.addProduct(product);
        shoppingBasket.addProduct(product);
        shoppingBasket.removeProduct(product);
        assertEquals(1, shoppingBasket.getNumberOfProducts());
    }

    @Test
    public void canEmptyBasket() {
        shoppingBasket.addProduct(product);
        shoppingBasket.addProduct(product);
        shoppingBasket.clearBasket();
        assertEquals(0, shoppingBasket.getNumberOfProducts());
    }

}

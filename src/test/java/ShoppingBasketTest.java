import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Product product1;
    Product product2;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        product1 = new Product("Eggs", 5);
        product2 = new Product("Salmon", 5);
    }

    @Test
    public void ShoppingBasketStartsEmpty() {
        assertEquals(0, shoppingBasket.getNumberOfProducts());
    }

    @Test
    public void canAddproductToShoppingBasket() {
        shoppingBasket.addProduct(product1);
        assertEquals(1, shoppingBasket.getNumberOfProducts());
    }

    @Test
    public void canRemoveFromShoppingBasket() {
        shoppingBasket.addProduct(product1);
        shoppingBasket.addProduct(product2);
        shoppingBasket.removeProduct(product1);
        assertEquals(1, shoppingBasket.getNumberOfProducts());
    }

    @Test
    public void canEmptyBasket() {
        shoppingBasket.addProduct(product1);
        shoppingBasket.addProduct(product2);
        shoppingBasket.clearBasket();
        assertEquals(0, shoppingBasket.getNumberOfProducts());
    }

    @Test
    public void canReturnTotalPrice() {
        shoppingBasket.addProduct(product1);
        shoppingBasket.addProduct(product2);
        assertEquals(10, shoppingBasket.getTotalCost(), 0.01);
    }


    @Test


}

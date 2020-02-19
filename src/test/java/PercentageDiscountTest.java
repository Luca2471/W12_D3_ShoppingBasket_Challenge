import org.junit.Before;
import org.junit.Test;

public class PercentageDiscountTest {

    ShoppingBasket shoppingBasket;
    Product product1;
    Product product2;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        product1 = new Product("Eggs", 10);
        product2 = new Product("Salmon", 20);
    }

    @Test
    public void canGiveTenPercentageDiscount() {
        shoppingBasket.addProduct(product1);
        shoppingBasket.addProduct(product2);
        shoppingBasket.getTenPercentDiscount();
    }

}

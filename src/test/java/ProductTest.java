import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Product product;

    @Before
    public void before() {
        product = new Product("Imperial leather", 2.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Imperial leather", product.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(2.0, product.getPrice(), 0.01);
    }


}

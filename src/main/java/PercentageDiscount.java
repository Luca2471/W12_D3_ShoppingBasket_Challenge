public class PercentageDiscount {

    public PercentageDiscount() {
    }

    public double getTenPercentDiscount(ShoppingBasket shoppingBasket) {
        double total = 0;
        if (shoppingBasket.getTotalCost() > 20) {
             total *= 0.10;
        }
        return total;
    }

}


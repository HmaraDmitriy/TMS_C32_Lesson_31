package task1.discount;

public class PriceCalculator {
    private DiscountStrategy discountStrategy;


    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }


    public double calculatePrice(double basePrice) {
        if (discountStrategy == null) {
            return basePrice;
        }
        return discountStrategy.applyDiscount(basePrice);
    }
}

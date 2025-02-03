package task1.discount;


public class PercentageDiscount implements DiscountStrategy {
    private final double discountPercent;

    public PercentageDiscount(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double applyDiscount(double price) {
        return price * (1 - discountPercent / 100);
    }
}

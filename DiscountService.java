public class DiscountService {
  public double calculateDiscount(Order order) {
    if (order.getTotalAmount() <= 100) {
        return 0.0; // Early return for orders below $100
    }

    if (order.getCustomer().isPremium()) {
        return 0.2; // 20% discount for premium customers
    }

    return 0.1; // 10% discount for regular customers
}
}

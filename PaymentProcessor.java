public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Processing credit card payment of $" + amount);
        } else if (paymentMethod.equals("PayPal")) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (paymentMethod.equals("Bitcoin")) {
            System.out.println("Processing Bitcoin payment of $" + amount);
        } else {
            throw new IllegalArgumentException("Unknown payment method");
        }
    }
}

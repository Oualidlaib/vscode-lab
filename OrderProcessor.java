public class OrderProcessor {

    public void printOrderSummary(Order order) {
        // Calculate total price
        double totalPrice = calculateTotalPrice(order.getItems());

        // Apply discount
        totalPrice = applyDiscount(totalPrice, order.getCustomer().isMember());

        // Print summary
        printSummary(order, totalPrice);
    }

    private double calculateTotalPrice(List<Item> items) {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    private double applyDiscount(double totalPrice, boolean isMember) {
        if (isMember) {
            return totalPrice * 0.9; // 10% discount for members
        }
        return totalPrice;
    }

    private void printSummary(Order order, double totalPrice) {
        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());
        printItems(order.getItems());
        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }

    private void printItems(List<Item> items) {
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println("  - " + item.getName() + ": " + item.getQuantity() + " x $" + item.getPrice() + " = $" + (item.getQuantity() *       item.getPrice()));
        }
    }
    
    
    
    
    public void processOrder(Order order) {
        // Validate order
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one item");
        }
        if (order.getCustomer() == null) {
            throw new IllegalArgumentException("Order must have a customer");
        }

        // Process order
        System.out.println("Processing order for customer: " + order.getCustomer().getName());

        // Validate payment
        if (order.getPayment() == null) {
            throw new IllegalArgumentException("Order must have a payment method");
        }
        if (order.getPayment().getAmount() <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than 0");
        }

        // Process payment
        System.out.println("Processing payment of $" + order.getPayment().getAmount());
    }

    public void processRefund(Order order) {
        // Validate order
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one item");
        }
        if (order.getCustomer() == null) {
            throw new IllegalArgumentException("Order must have a customer");
        }

        // Process refund
        System.out.println("Processing refund for customer: " + order.getCustomer().getName());

        // Validate payment
        if (order.getPayment() == null) {
            throw new IllegalArgumentException("Order must have a payment method");
        }
        if (order.getPayment().getAmount() <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than 0");
        }

        // Process refund payment
        System.out.println("Refunding payment of $" + order.getPayment().getAmount());
    }
} 

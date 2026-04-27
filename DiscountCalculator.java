class DiscountCalculator {
    private final CalculationService calculationService;

    public DiscountCalculator(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    public double calculateDiscountedTotal(double subtotal, double taxRate, double discountRate) {
        double total = calculationService.calculateTotal(subtotal, taxRate);
        return calculationService.applyDiscount(total, discountRate);
    }
}

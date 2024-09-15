public interface PaymentMethod {
    void processPayment(String tripId, double amount);
}


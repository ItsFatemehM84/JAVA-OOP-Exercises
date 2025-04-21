public class PaymentGateway {
    public static boolean processPayment(String paymentMethod, double amount) {
        System.out.println("Processing payment via " + paymentMethod + " for $" + amount);
        return true; // Simulating successful payment
    }
}

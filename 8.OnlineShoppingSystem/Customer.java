public class Customer {
    private String name;
    private ShoppingCart cart;
    private OrderHistory orderHistory;

    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
        this.orderHistory = new OrderHistory();
    }

    public void addToCart(Product product) {
        cart.addItem(product);
    }

    public void placeOrder(String paymentMethod) {
        double totalAmount = cart.calculateTotal();
        if (PaymentGateway.processPayment(paymentMethod, totalAmount)) {
            String orderSummary = "Order for " + name + ": Total $" + totalAmount;
            orderHistory.addOrder(orderSummary);
            cart.checkout();
        } else {
            System.out.println("Payment failed!");
        }
    }

    public void viewOrderHistory() {
        orderHistory.displayOrders();
    }
}

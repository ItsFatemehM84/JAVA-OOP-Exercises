import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private List<String> orders;

    public OrderHistory() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(String orderSummary) {
        orders.add(orderSummary);
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No past orders found.");
            return;
        }
        System.out.println("Order History:");
        for (String order : orders) {
            System.out.println(order);
        }
    }
}

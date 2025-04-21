import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }
        System.out.println("Order Summary:");
        for (Product item : items) {
            System.out.println(item);
        }
        System.out.println("Total amount: $" + calculateTotal());
        System.out.println("Order placed successfully!");
        items.clear();
    }
}

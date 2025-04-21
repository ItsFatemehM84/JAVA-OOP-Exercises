import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> inventory;

    public Store() {
        this.inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
        System.out.println(product.getName() + " added to store.");
    }

    public List<Product> getProducts() {
        return inventory;
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }
}

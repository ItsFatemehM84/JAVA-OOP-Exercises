public class Main {
    public static void main(String[] args) {
        UserAuthentication auth = new UserAuthentication();
        auth.registerUser("Alice", "securepassword");

        if (auth.loginUser("Alice", "securepassword")) {
            System.out.println("Login successful!");

            Store store = new Store();
            Product laptop = new Product("Laptop", 999.99);
            Product phone = new Product("Smartphone", 499.99);

            store.addProduct(laptop);
            store.addProduct(phone);

            Customer customer = new Customer("Alice");
            customer.addToCart(laptop);
            customer.addToCart(phone);
            customer.placeOrder("Credit Card");

            customer.viewOrderHistory();
        } else {
            System.out.println("Login failed!");
        }
    }
}

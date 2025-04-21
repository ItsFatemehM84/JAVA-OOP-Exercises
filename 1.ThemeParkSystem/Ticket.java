public class Ticket {
    private String rideName;
    private double price;
    private boolean isValid;

    public Ticket(String rideName, double price) {
        this.rideName = rideName;
        this.price = price;
        this.isValid = true;
    }

    public boolean isValid() {
        return isValid;
    }

    public void useTicket() {
        isValid = false;
    }

    @Override
    public String toString() {
        return "Ticket for " + rideName + " - Price: $" + price + " - Valid: " + isValid;
    }
}

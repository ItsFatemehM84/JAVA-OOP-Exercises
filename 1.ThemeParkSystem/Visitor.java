import java.util.ArrayList;
import java.util.List;

public class Visitor {
    private String name;
    private List<Ticket> tickets;

    public Visitor(String name) {
        this.name = name;
        this.tickets = new ArrayList<>();
    }

    public void purchaseTicket(String rideName, double price) {
        tickets.add(new Ticket(rideName, price));
        System.out.println(name + " purchased a ticket for " + rideName);
    }

    public boolean hasValidTicket(String rideName) {
        for (Ticket ticket : tickets) {
            if (ticket.isValid() && ticket.toString().contains(rideName)) {
                ticket.useTicket();
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}

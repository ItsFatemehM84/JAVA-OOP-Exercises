public class VIPVisitor extends Visitor {
    public VIPVisitor(String name) {
        super(name);
    }

    @Override
    public boolean hasValidTicket(String rideName) {
        return true; // VIPs get automatic access
    }
}

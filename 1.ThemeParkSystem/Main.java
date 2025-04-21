public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Ride rollerCoaster = new RollerCoaster("Extreme Coaster", 5, 3, 80);
        Ride waterSlide = new WaterSlide("Aqua Slide", 3, 5, true);
        Ride ferrisWheel = new FerrisWheel("Sky Wheel", 10, 7, 30);

        admin.addRide(rollerCoaster);
        admin.addRide(waterSlide);
        admin.addRide(ferrisWheel);

        Visitor john = new Visitor("John");
        VIPVisitor alice = new VIPVisitor("Alice");

        john.purchaseTicket("Extreme Coaster", 10);
        john.purchaseTicket("Aqua Slide", 7);

        if (john.hasValidTicket("Extreme Coaster")) {
            rollerCoaster.start();
        }

        if (alice.hasValidTicket("Sky Wheel")) {
            ferrisWheel.start();
        }
    }
}

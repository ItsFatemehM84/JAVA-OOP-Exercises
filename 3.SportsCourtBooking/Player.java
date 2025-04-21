public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public boolean bookCourt(Court court, String timeSlot) {
        if (court.bookCourt(timeSlot)) {
            System.out.println(name + " successfully booked a " + court.getSportType() + " court at " + timeSlot);
            return true;
        }
        System.out.println("Court is already booked at " + timeSlot);
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Court basketballCourt = new Court("Basketball");
        Court tennisCourt = new Court("Tennis");

        admin.addCourt(basketballCourt);
        admin.addCourt(tennisCourt);

        Player player1 = new Player("John");
        Player player2 = new Player("Alice");

        player1.bookCourt(basketballCourt, "11:00 AM");
        player2.bookCourt(basketballCourt, "11:00 AM"); // Should print "Court is already booked!"
        player2.bookCourt(basketballCourt, "01:00 PM"); // Successful booking

        admin.showAllCourts();
    }
}

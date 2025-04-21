public class FerrisWheel extends Ride {
    private int height;

    public FerrisWheel(String name, int capacity, int duration, int height) {
        super(name, capacity, duration);
        this.height = height;
    }

    @Override
    public void startRide() {
        System.out.println(name + " is rotating at " + height + " meters high!");
    }
}

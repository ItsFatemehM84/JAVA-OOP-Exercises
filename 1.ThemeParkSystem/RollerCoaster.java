public class RollerCoaster extends Ride {
    private int speed;

    public RollerCoaster(String name, int capacity, int duration, int speed) {
        super(name, capacity, duration);
        this.speed = speed;
    }

    @Override
    public void startRide() {
        System.out.println("Roller Coaster " + name + " is running at " + speed + " km/h!");
    }
}

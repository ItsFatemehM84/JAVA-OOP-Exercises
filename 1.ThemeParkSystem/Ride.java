public abstract class Ride extends Thread {
    protected String name;
    protected int capacity;
    protected int duration;

    public Ride(String name, int capacity, int duration) {
        this.name = name;
        this.capacity = capacity;
        this.duration = duration;
    }

    public abstract void startRide();

    @Override
    public void run() {
        startRide();
        try {
            Thread.sleep(duration * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " has finished!");
    }
}

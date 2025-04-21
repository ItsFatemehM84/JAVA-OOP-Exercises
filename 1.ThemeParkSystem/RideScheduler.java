import java.util.ArrayList;
import java.util.List;

public class RideScheduler {
    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public void startAllRides() {
        for (Ride ride : rides) {
            ride.start();
        }
    }
}

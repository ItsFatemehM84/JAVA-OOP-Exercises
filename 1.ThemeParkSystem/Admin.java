import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Ride> rides;

    public Admin() {
        rides = new ArrayList<>();
    }

    public void addRide(Ride ride) {
        rides.add(ride);
        System.out.println("Ride " + ride.getName() + " has been added to the park.");
    }
}

import java.util.HashMap;
import java.util.Map;

public class Court {
    private String sportType;
    private Map<String, Boolean> timeSlots;

    public Court(String sportType) {
        this.sportType = sportType;
        this.timeSlots = new HashMap<>();
        initializeSlots();
    }

    private void initializeSlots() {
        String[] slots = {"09:00 AM", "11:00 AM", "01:00 PM", "03:00 PM", "05:00 PM"};
        for (String slot : slots) {
            timeSlots.put(slot, true);
        }
    }

    public boolean bookCourt(String timeSlot) {
        if (timeSlots.getOrDefault(timeSlot, false)) {
            timeSlots.put(timeSlot, false);
            return true;
        }
        return false;
    }

    public void releaseCourt(String timeSlot) {
        timeSlots.put(timeSlot, true);
    }

    public void displayAvailability() {
        System.out.println("Availability for " + sportType + " court:");
        for (Map.Entry<String, Boolean> entry : timeSlots.entrySet()) {
            System.out.println(entry.getKey() + " - " + (entry.getValue() ? "Available" : "Booked"));
        }
    }

    public String getSportType() {
        return sportType;
    }
}

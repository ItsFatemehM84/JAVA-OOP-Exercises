public class WaterSlide extends Ride {
    private boolean hasWaterJets;

    public WaterSlide(String name, int capacity, int duration, boolean hasWaterJets) {
        super(name, capacity, duration);
        this.hasWaterJets = hasWaterJets;
    }

    @Override
    public void startRide() {
        String waterEffect = hasWaterJets ? "with water jets" : "without water jets";
        System.out.println(name + " has started! " + waterEffect);
    }
}

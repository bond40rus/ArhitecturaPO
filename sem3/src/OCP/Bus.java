package OCP;

public class Bus extends Vehicle  {
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return super.maxSpeed * 0.5;
    }
}

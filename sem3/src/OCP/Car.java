package OCP;

public class Car extends  Vehicle {
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return super.maxSpeed * 0.8;
    }
}

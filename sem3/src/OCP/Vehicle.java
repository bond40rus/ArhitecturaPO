package OCP;

public abstract class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }

    public double calculateAllowedSpeed(Vehicle vehicle) {
        return maxSpeed;
        }
}

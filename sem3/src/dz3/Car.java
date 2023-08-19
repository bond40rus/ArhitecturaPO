package dz3;
import java.awt.*;

public abstract class Car {
    private String model;
    private Color color;
    private TypeCar typeCar;
    private int regNumber;
    private TypeFuel typeFuel;
    private Transmission transmission;


    public Car(String model, Color color, TypeCar typeCar, int regNumber, TypeFuel typeFuel, Transmission transmission) {
        this.model = model;
        this.color = color;
        this.typeCar = typeCar;
        this.regNumber = regNumber;
        this.typeFuel = typeFuel;
        this.transmission = transmission;
    }

    public void movement() {
    }

    public void maintenance() {
    }

    public abstract int gearShift(int gear);

    public boolean turnLights() {
        return true;
    }






    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public TypeFuel getTypeFuel() {
        return typeFuel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public void setTypeFuel(TypeFuel typeFuel) {
        this.typeFuel = typeFuel;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}

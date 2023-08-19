package dz3;

import java.awt.*;

public class Fura extends Car implements iRestoreFuel {

    protected float trailer_volume;

    public Fura(String model, Color color, TypeCar typeCar, int regNumber, TypeFuel typeFuel, Transmission transmission, float trailer_volume) {
        super(model, color, typeCar, regNumber, typeFuel, transmission);
        this.trailer_volume = trailer_volume;
    }

    public float getTrailer_volume() {
        return trailer_volume;
    }

    public void setTrailer_volume(float trailer_volume) {
        this.trailer_volume = trailer_volume;
    }

    @Override
    public void fuel() {

    }

    @Override
    public int gearShift(int gear) {
        return 0;
    }
}

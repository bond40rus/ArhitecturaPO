package ISP;

public class Cube implements Shape, TreeDShape {
    private int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length * 6;
    }

    @Override
    public double value() {
        return length * length * length;
    }
}

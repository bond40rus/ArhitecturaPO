package LSP;

public class Rectangle extends QuadRangle {
    protected  int with;
    protected int height;

    public Rectangle(int with, int height) {
        this.with = with;
        this.height = height;
    }

    @Override
    public int area() {
        return this.with * this.height;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


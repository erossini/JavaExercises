package interfaces;

public class Square implements Shape {
    private double  width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}

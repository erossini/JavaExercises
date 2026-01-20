package interfaces;

public interface Shape {
    double getArea();

    public static double sumAreas(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return(sum);
    }
}
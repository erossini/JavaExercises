package interfaces;

public class Main {
    static void main() {
        Shape[] shapes = {
                new Circle(10),
                new Rectangle(10, 5),
                new Square(10)
        };

        System.out.printf("Sum of areas: " + Shape.sumAreas(shapes));
    }
}

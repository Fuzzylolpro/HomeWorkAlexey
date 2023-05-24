package HomeWork.Lesson9.Exercise2;

public class Circle extends Figure {
    double radius;

    public Circle(float x, float y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}

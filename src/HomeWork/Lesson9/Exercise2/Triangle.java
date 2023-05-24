package HomeWork.Lesson9.Exercise2;

public class Triangle extends Figure {
    double side1;
    double side;
    double side2;
    double height;

    public Triangle(float x, float y, double side1, double side, double side2, double height) {
        super(x, y);
        this.side1 = side1;
        this.side = side;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return side2 + side + side1;
    }

    @Override
    public double getArea() {
        return (height * side) / 2;
    }
}

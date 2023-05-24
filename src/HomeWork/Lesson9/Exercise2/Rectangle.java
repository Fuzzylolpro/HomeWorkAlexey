package HomeWork.Lesson9.Exercise2;

public class Rectangle extends Figure {

    double width;
    double height;

    public Rectangle(float x, float y, double widght, double height) {
        super(x, y);
        this.width = widght;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

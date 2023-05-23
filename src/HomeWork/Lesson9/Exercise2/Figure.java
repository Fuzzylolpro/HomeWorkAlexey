package HomeWork.Lesson9.Exercise2;

public abstract class Figure {
    abstract void square();

    void squareCircle(double radius) {
        double area = Math.PI * (radius * radius);
    }

    void squareRectangle(double a, double b) {
        double area = a * b;
    }

    void squareTriangle(double height, double side) {
        double area = (height * side) / 2;
    }

    abstract void Perimeter();

    double perimetrCirle(double radius) {
        double area = Math.PI * 2 * radius;
        return area;
    }

    double perimetrTriangle(double a, double b, double c) {
        double area = a + b + c;
        return area;
    }

    double perimetrReactangle(double a, double b) {
        double area = 2 * (a + b);
        return area;
    }
}

package Lesson8;

public class Triangle extends Shape{
    @Override
    void drow() {
        System.out.println("Рисовать треугольник");
    }

    @Override
    void erse() {
        System.out.println("Стирать треугольник");
    }
}

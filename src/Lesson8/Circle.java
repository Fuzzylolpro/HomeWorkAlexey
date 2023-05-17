package Lesson8;

public class Circle extends Shape{
    @Override
    void drow(){
        System.out.println("Рисовать круг");
    };

    @Override
    void erse(){
        System.out.println("Стирать круг");
    }
}

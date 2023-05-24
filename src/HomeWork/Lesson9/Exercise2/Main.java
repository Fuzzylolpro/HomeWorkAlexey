package HomeWork.Lesson9.Exercise2;

public class Main {
    public static void main(String[] args) {
        /*Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        double figure[] = new double[5];
        figure[0] = circle.perimetrCirle(5);
        figure[1] = rectangle.perimetrReactangle(5, 5);
        figure[2] = triangle.perimetrTriangle(5, 5, 5);
        figure[3] = circle.perimetrCirle(5);
        figure[4] = rectangle.perimetrReactangle(5, 5);


        double sum = 0;
        for (int i = 0; i < figure.length; i++) {
            sum = sum + figure[i];
        }
        System.out.println(figure[0]);
        System.out.println(figure[1]);
        System.out.println(figure[2]);
        System.out.println(figure[3]);
        System.out.println(figure[4]);
        System.out.println("Общая сумма периметров фигур = " + sum);
    }*/
        Triangle triangle = new Triangle(1, 2, 3, 4, 5, 6);
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        Circle circle = new Circle(1, 2, 3);
        double figure[] = new double[5];
        figure[0] = circle.getPerimeter();
        figure[1] = rectangle.getPerimeter();
        figure[2] = triangle.getPerimeter();
        figure[3] = circle.getPerimeter();
        figure[4] = rectangle.getPerimeter();
        double sum = 0;
        for (int i = 0; i < figure.length; i++) {
            sum = sum + figure[i];
        }
        System.out.println(figure[0]);
        System.out.println(figure[1]);
        System.out.println(figure[2]);
        System.out.println(figure[3]);
        System.out.println(figure[4]);
        System.out.println("Общая сумма периметров фигур = " + sum);

    }
}


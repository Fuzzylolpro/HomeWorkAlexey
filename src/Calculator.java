public class Calculator {
    double weight = 10.5;
    int cost = 100;
    String color = "Black";

    public Calculator(double weight, int cost, String color) {
        System.out.println("Выполняется конструктор");
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }
    {
        System.out.println("Мы создаём калькулятор");
    }

    long findSum(int a, int b) {
        return a + b;
    }

    double findDel(int a, int b) {
        return (double) a / b;
    }

    long findRaz(int a, int b) {
        return a - b;
    }

    long findMult(int a, int b) {
        return (long) a * b;
    }
}

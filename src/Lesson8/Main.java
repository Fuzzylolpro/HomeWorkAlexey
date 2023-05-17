package Lesson8;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Developer developer1 = new Developer();
        developer.name = "Sasha";
        developer1.name = "Dima";
        System.out.println(Developer.SALARY);
    }
}

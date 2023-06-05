package Lesson13;

public class Exception18 extends Exception {
    int age;

    public Exception18(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Меньше 18-ти лет" + age;
    }
}

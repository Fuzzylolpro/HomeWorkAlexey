package Lesson9;

public interface Firstinterface {
    public final static int WHEEL =4;
    void start(); // Абстрактные методы
    void stop();
    //default - описание метода(можно не переопределять)
    default void signal(){
        System.out.println("Some sound!");
    }
    void changeSpeed(int a);
}

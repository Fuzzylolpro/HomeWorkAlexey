package Lesson9;

@FunctionalInterface // Ставится над интерфейсами с одним абстарктным методом
public interface FirstFuntionalInterface {
    int shouldBeOneMethod(); // один асбтрактный обязательно
    default void hello(){

    } // сколько уголдно
}

package Lesson9;

//Абстрактный класс может иметь абстактные методы
public abstract class Fruit {  // не может создавать обьект
    private int cost;

    public Fruit(int cost) {
        this.cost = cost;
    }

    public void satHello(){
        System.out.println("Hello");
    }
    abstract void teste();
}

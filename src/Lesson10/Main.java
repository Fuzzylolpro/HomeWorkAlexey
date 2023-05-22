package Lesson10;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        House secondHouse = new House();
        house.setCost(1000);;
        house.setColor("balck");
        System.out.println(secondHouse.hashCode());
    }
}

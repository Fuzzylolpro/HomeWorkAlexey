package Lesson10;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        House house = new House();
        House secondHouse = new House();
        house.setCost(1000);
        house.setColor("black");
        secondHouse.setCost(1000);
        secondHouse.setColor("black");


        System.out.println(secondHouse.hashCode());
        System.out.println(house.hashCode());
        System.out.println(house);
        System.out.println(secondHouse);
        System.out.println(house.equals(secondHouse));

        //Clone
        House newHouse = (House) house.clone(); //Object -> Old.House
        System.out.println(newHouse.getColor());

        //getClass - методанные класса. Рефлексия
        Class metaInfo = house.getClass();

        Class[] interfaces = metaInfo.getInterfaces();

        for (Class classInterface : interfaces) {
            System.out.println(classInterface.getName());
        }



    }
}

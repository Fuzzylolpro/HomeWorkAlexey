package Lesson15;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        HashSet<Person> list = new HashSet<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (Person o : list){
            System.out.println(o);
        }
        list.remove(p1);
        list.remove(p2);
        System.out.println(list);

    }
}

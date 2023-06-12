package Lesson15;

import java.util.LinkedList;

public class Examle2 {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("Беларусь");
        System.out.println(list);
        list.addFirst("Польша");
        list.addFirst("Германия");
        list.addLast("Франция");
        list.addLast("Италия");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}

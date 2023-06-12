package Lesson15;

import java.util.ArrayList;

public class Exemple {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Беларусь");
        list.add("Россия");
        list.add("Украина");
        list.set(2,"Польша");
        list.remove(2);
        list.remove("Беларусь");
        System.out.println(list.contains("Украина"));
        System.out.println(list.get(0));
        System.out.println(list);

    }
}

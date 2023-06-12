package Lesson15;

public class LinkedList {
    public static void main(String[] args) {
        //Двусвязный список
        //о(n) время поиска
        java.util.LinkedList<String> list= new java.util.LinkedList<>();
        list.add("one");
        list.add("two");
        list.addFirst("Hello"); // добовляем в начало
        System.out.println(list);
    }
}

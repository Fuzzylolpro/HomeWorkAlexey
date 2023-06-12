package Lesson15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        //хаотично добовляет
        HashSet<String> list = new HashSet<>();
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        //в порядке добавления
        LinkedHashSet<String> list1 = new LinkedHashSet<>();
        list1.add("one");
        list1.add("one");
        list1.add("one");
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        System.out.println(list1);
        //Сортирует
        TreeSet<Integer>list2 = new TreeSet<>();
        list2.add(1);
        list2.add(7);
        list2.add(3);
        list2.add(9);
        System.out.println(list2);
        System.out.println(list2.floor(6)); //вниз ближайшее значение
        System.out.println(list2.ceiling(6)); //вверх ближайшее значение
        System.out.println(list2.comparator());

        // HashSet<Integer> хэш таблицы - Быстрый поиск
        // TreeSet<Integer>
        // LinkedHashSet<Integer>
    }
}

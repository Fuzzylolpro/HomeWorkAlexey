package Lesson16;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        /*//FIFO
        arrayDeque.add("First");
        arrayDeque.add("Second");
        System.out.println(arrayDeque);
        arrayDeque.remove();
        System.out.println(arrayDeque);*/
        //LIFO
        arrayDeque.add("First");
        arrayDeque.add("Second");
        System.out.println(arrayDeque);
        arrayDeque.removeLast();
        System.out.println(arrayDeque);

    }
}
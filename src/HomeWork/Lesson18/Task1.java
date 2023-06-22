package HomeWork.Lesson18;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(7);

        List<Integer> uniqueList = arrayList.stream()
                .distinct()
                .toList();
        System.out.println(uniqueList);

        List<Integer> evenList = arrayList.stream()
                .filter(i -> i % 2 == 0)
                .toList();
        System.out.println(evenList);

        int sum = arrayList.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);




    }
}

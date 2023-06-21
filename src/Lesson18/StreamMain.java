package Lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        // // create of()
        // Stream.of(10,20,30,40,50);

        // //create collection
        // ArrayList<String> list = new ArrayList<>();
        // list.stream();

        // //create array
        // int array[] = {10,20,30,40,50};
        // Arrays.stream(array);

        Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 50)
                //конвеерные методы
                .filter(num -> num > 25)
                .skip(2) //- пропуск элементов
                .distinct() // пропуск дубликатов
                .peek(p -> Math.round(p)) // выполняет методы наши
                .limit(3) // пропускает n элементов дальше
                .sorted() // сортировка
                //.map(n -> n + " USD")// преобразует
                //.flatMap(a -> Arrays.stream(a.split(" ")))
                //Терминальные
                .forEach(System.out::println);
                //.findFirst(); // покажи 1-ое
                //.findAny(); // random
                //.collect(Collectors.toList());
                //.collect(Collectors.toSet());
                       // .count();
                       //        .anyMatch(a ->a.equals("USD"));
                             //  .noneMatch();
                               //      .allMatch(a -> a.length()>1);
                                 //      .min(Integer::compare);
                                      //   .max(Integer::compareTo);
                                          //    .toArray(value -> new String[value]);
                                                //  .reduce((a,b)->a+b+"11");

        System.out.println();
    }
}

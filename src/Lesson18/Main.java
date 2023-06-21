package Lesson18;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Create Optional
        Optional<Object> firstOptional = Optional.empty();

        Optional<String> strLine = Optional.of("OlA"); // Если уверены что обьект не null

        String line = "group67";
        Optional<String> strLineNull = Optional.ofNullable(line);

        //Check is empty or not
        System.out.println(strLineNull.isPresent()); // Есть чтото
        System.out.println(strLineNull.isEmpty()); // Есть ли null

        //run some code
        strLineNull.ifPresent(l -> System.out.println(l));  // Выполняет действие если Optional не пустой

        //open Oprional
        String result = strLineNull.orElse("Default_value"); // если ноль, делай это
        String result1 = strLineNull.orElseGet(()->{
            return "Default_value";
        }); // если ноль, делай это, больший функционал, выполняют лямду
        String result2 = strLineNull.get(); // Делают редко
        String result3 = strLineNull.orElseThrow();
        String result4 = strLineNull.orElseThrow(()->new ArithmeticException());

        Optional<String> res = strLineNull.filter(value -> value.equals("group67"));
        // if filter true -> optional с обьектом
        //if filter false -> optional.empty();
        System.out.println(res);

        //map() принимает значение отдает другое
        int size = strLineNull.map(value-> value.length()).orElse(0);
        System.out.println(size);

    }
}

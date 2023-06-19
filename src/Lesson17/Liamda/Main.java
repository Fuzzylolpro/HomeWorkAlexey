package Lesson17.Liamda;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // //1.create lambda
        // Funinterf firstLambda = (int a, int b) -> a + b;
        // Funinterf secondLambda = (int a, int b) -> a - b;

        //UnaryOperator<Integer> firstLambdaUnary = (a) -> a * a; // принимает 1 параметр
        //BinaryOperator<Integer> firstLambda = (a, b) -> a + b; // принимает 2 параметра
        //Predicate<Integer> pl = (number) -> number % 2 == 0; // принимает значение, возращает true or false
        //System.out.println(pl.test(5));
        //Consumer<Integer> cl = (a) -> System.out.println(a); // принимает параметр, но не возращает результат
        //Supplier<Integer> sl = () -> {
        //    Scanner scanner = new Scanner(System.in);
        //    return scanner.nextInt();
        //}; // НЕ принимает параметр, но возращает значение
        //Function<String,Integer> fl = (a) -> Integer.parseInt(a); // Принимает тип T , возращает R

        //use lambda
        //long result = firstLambda.apply(10, 20);
        //System.out.println(result);

        BinaryOperator<Integer> firstLambda = (a, b) -> {
            if (a > b) {
                return b;
            }
            if (a < b) {
                return a;
            }
            return 0;
        };
        System.out.println(firstLambda.apply(10,10));


        }
    }

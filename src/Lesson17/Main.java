package Lesson17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
       // System.out.println(date);
       // LocalDate date = LocalDate.of(1890,2,2);
        //LocalDate date = LocalDate.parse("2033-02-03");
        LocalDate date = LocalDate.parse("2033-02-03");
        date = date.plusDays(10);
        date = date.minusYears(3);
        date = date.minus(1, ChronoUnit.MILLENNIA);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.isLeapYear()); // высокосный год?


        System.out.println(date.isAfter(dateNow));
        System.out.println(date.isBefore(dateNow));

    }
}

package Lesson17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        // String data =scanner.nextLine();
        //LocalDate date1 = LocalDate.parse(data);
        //System.out.println(date1.getDayOfWeek());
        //LocalDate date = LocalDate.now();
        //System.out.println(date);
        //do {
        //    date = date.plusDays(1);
        //} while (!date.getDayOfWeek().equals(DayOfWeek.TUESDAY));
        //System.out.println(date);
        //System.out.println(LocalDate.MAX);
        //System.out.println(LocalDateTime.now());
        LocalDate d = LocalDate.now();
        System.out.println(d.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
        System.out.println(d);






    }
}

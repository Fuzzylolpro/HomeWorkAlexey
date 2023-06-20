package HomeWork.Lesson17;

import java.time.LocalDate;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data =scanner.nextLine();
        LocalDate date1 = LocalDate.parse(data);
        System.out.println(date1.plusYears(100));
    }
}

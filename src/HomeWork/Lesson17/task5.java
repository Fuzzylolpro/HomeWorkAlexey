package HomeWork.Lesson17;

import java.util.Scanner;
import java.util.function.Supplier;

public class task5 {
    public static void main(String[] args) {
        Supplier<String> sl = () -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        };
        String inputString = sl.get();
        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println(reversedString);
    }
}

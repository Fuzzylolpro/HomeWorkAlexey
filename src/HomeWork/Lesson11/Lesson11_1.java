package HomeWork.Lesson11;

import java.util.Scanner;

public class Lesson11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shortestString = null;
        String longString = null;
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите строку №" + (i + 1));
            String str = scanner.nextLine();
            if (i == 0) {
                shortestString = str;
            } else if (shortestString.length() > str.length()) {
                shortestString = str;
            }
            if (i == 0) {
                longString = str;
            } else if (longString.length() < str.length()) {
                longString = str;
            }
        }
        System.out.println("Длинна самой короткой строки: " + shortestString.length());
        System.out.println("Самая короткая строка: " + shortestString);
        System.out.println("Длинна самой длинной строки: " + longString.length());
        System.out.println("Самая длинная строка: " + longString);
    }
}



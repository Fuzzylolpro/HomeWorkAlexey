package HomeWork.Lesson11;

import java.util.Scanner;

public class Lesson11_3 {
    public static void main(String[] args) {
        String[] str = new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = scanner.nextLine();
        }
        float average = 0;
        for (String item : str) {
            average += (float) item.length();
        }
        average /= str.length;
        System.out.println("Средняя длина строки = (" + average + ")");
        for (int i = 0; i < 3; i++) {
            if (str[i].length() < average) {
                System.out.println("Строка меньшая чем средняя длина: " + str[i]);
                System.out.println("Её длина = " + str[i].length());
            }
        }
    }
}



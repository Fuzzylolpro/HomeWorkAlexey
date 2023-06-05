package HomeWork.Lesson12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String[] words = str.split(" +");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            if (word.matches("[А-я]{2,6}")) //как добавить что бы запятую не читало?
                System.out.println(word);
        }


       /* Pattern pattern = Pattern.compile("[А-я]{2,6}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/
    }
}

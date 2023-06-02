package HomeWork.Lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        //teachmeskills@gmail.com    2223-5665-45
        //greenmassa@gmail.com  +(xx)xxxxxxx  +(22)1234567
        //funtik@mail.ru  номер документа  1423-1512-51
        Pattern numberPhone = Pattern.compile("(\\+\\(\\d{2}\\)\\d{7})");
        Pattern document = Pattern.compile("\\d{4}[- ]\\d{4}[- ]\\d{2}");
        Pattern emailAddress = Pattern.compile("\\s.+@.+\\.[a-z]+");

        Matcher matcher = numberPhone.matcher(str);
        Matcher matcher1 = document.matcher(str);
        Matcher matcher2 = emailAddress.matcher(str);

        /*if (matcher.matches()) {
            System.out.println(str);
        }
        else
        {
            System.out.println("Номер не найден");
        }
        if (matcher1.matches()) {
            System.out.println(str);
        }
        else
        {
            System.out.println("Документ не найден");
        }
        if (matcher2.matches()) {
            System.out.println(str);
        }
        else
        {
            System.out.println("Емейл не найден");
        }*/

        while (matcher.find()) {
            System.out.println("Номер телефона: " + matcher.group());
        }
        while (matcher1.find()) {
            System.out.println("Номер документа: " + matcher1.group());
        }
        while (matcher2.find()) {
            System.out.println("Email адрес : " + matcher2.group());
        }
    }
}

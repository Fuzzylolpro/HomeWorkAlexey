package Lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
       String testLine ="Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
       // String pattern = "^[A-z]{3}$";// что ищем
        /*System.out.println(testLine.replaceAll(pattern,"5"));

        System.out.println("Hello\nWorld!");
        System.out.println("Hello\nWorld!");   */
        //System.out.println(testLine.replaceAll("[A-z]{1}","&"));

        Pattern pattern1 = Pattern.compile("\n+");
        Matcher matcher = pattern1.matcher(testLine);
        //String result = matcher.replaceAll("");
        //System.out.println(result);


        while (matcher.find()){
            System.out.println(matcher.group());
        }



    }
}

package HomeWork.Lesson17;

import java.util.Scanner;
import java.util.function.Function;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите сумму в BYN:");
        Scanner scanner = new Scanner(System.in);
        try {
            String money =scanner.nextLine();
            Function<String,Double> fl = i -> Double.parseDouble(money);{
                System.out.println(fl.apply(money) * 0.3352 + " USD");
            }
        } catch (Exception e){
            System.out.println("Неверная сумма");
        }
    }
}

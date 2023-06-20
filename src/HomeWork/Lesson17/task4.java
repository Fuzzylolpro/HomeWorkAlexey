package HomeWork.Lesson17;

import java.util.Scanner;
import java.util.function.Consumer;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите сумму в BYN:");
        Scanner scanner = new Scanner(System.in);
        try {
            String money = scanner.nextLine();
            Consumer<String> converter = str -> {
                double sum = Double.parseDouble(str.split(" ")[0]);
                double dollars = sum * 0.3352;
                System.out.println(dollars + " USD");
            };
            converter.accept(money);
        }catch (Exception e){
            System.out.println("Неверное значение");
        }
    }
}






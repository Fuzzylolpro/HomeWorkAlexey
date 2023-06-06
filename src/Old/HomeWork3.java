package Old;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] masDouble = new double[scanner.nextInt()];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = Math.random();
            System.out.println(masDouble[i]);
        /*Scanner scanner = new Scanner(System.in);
        double[] masDouble = new double[5];
        masDouble[0]=1.5;
        masDouble[1]=1.1;
        masDouble[2]=1.2;
        masDouble[3]=1.3;
        masDouble[4]=1.4;
        System.out.println(masDouble[0]);
        System.out.println(masDouble[1]);
        System.out.println(masDouble[2]);
        System.out.println(masDouble[3]);
        System.out.println(masDouble[4]);*/
        }
        System.out.println("/-----------------------------/");
        for (int i = masDouble.length - 1; i >= 0; i--) {
            System.out.println(masDouble[i]);
        }
        System.out.println("/-----------------------------/");
        double max = masDouble[0];
        for (int i = 1; i < masDouble.length; i++) {
            if (masDouble[i] > max)
                max = masDouble[i];
        }
        System.out.println("Максимальное число массива " + max);
        System.out.println("/-----------------------------/");
        double min = masDouble[0];
        for (int i = 1; i < masDouble.length; i++) {
            if (masDouble[i] < min)
                min = masDouble[i];
        }
        System.out.println("Минимальное число массива " + min);

        System.out.println("/-----------------------------/");
        for (int i = 0; i < masDouble.length; i++) {
            if (masDouble[i] == max)
                System.out.println("Индекс максимального элемента массива " + i);
        }
        for (int i = 0; i < masDouble.length; i++) {
            if (masDouble[i] == min)
                System.out.println("Индекс минимального элемента массива " + i);
        }
        System.out.println("/-----------------------------/");
        for (int i = 0; i < masDouble.length; i++) {
            if (masDouble[i] == 0) System.out.println(i);
            else System.out.println("Нет нулевых элементов");
            break;
        }

    }
}


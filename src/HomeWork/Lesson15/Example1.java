package HomeWork.Lesson15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        //HashSet<String> line3 = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] line1 = line.split("\\D");
        HashSet<String> line2 = new HashSet<>(List.of(line1));
        System.out.println(Arrays.toString(line1));
        System.out.println(line2);
    }
}

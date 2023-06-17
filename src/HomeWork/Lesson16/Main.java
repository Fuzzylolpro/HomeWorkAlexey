package HomeWork.Lesson16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] line1 = line.split(" ");
        System.out.println(Arrays.toString(line1));
        HashMap<String, Integer> counts = new HashMap<>();
        for (String str : line1) {
            if (counts.containsKey(str)) {
                counts.put(str, counts.get(str) + 1);
            } else {
                counts.put(str, 1);
            }
        }
        HashMap<String, Boolean> result = new HashMap<>();
        for (String str : line1) {
            if (counts.get(str) >= 2) {
                result.put(str, true);
            } else {
                result.put(str, false);
            }
        }
        System.out.println(result);
    }
}


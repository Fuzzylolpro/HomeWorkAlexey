package HomeWork.Lesson16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] line1 = line.split(" ");
        Map<String, String> map = new HashMap<>();
        for (String s : line1) {
            if (!s.isEmpty()) {
                String first = s.substring(0, 1);
                String last = s.substring(s.length() - 1, s.length());
                map.put(first, last);
            }
        }
        System.out.println(map);
    }
}

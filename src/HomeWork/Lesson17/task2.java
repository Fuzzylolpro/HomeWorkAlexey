package HomeWork.Lesson17;

import java.util.function.Predicate;

public class task2 {
    public static void main(String[] args) {
        int[] number = {-1, 2, 3, 4, 5, -6, -123, 124};
        for (int i = 0; i < number.length; i++) {
            int finalI = i;
            Predicate<Integer> pl = integer -> number[finalI] >= 0;
            if (pl.test(finalI)) {
                System.out.println(number[i]);
            }
        }
    }
}

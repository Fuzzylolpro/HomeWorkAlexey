package HomeWork.Lesson18;

import Lesson8.Developer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LessonTask_3 {
    public static void main(String[] args) {
        Developer1 developer1 = new Developer1();
        Arrays.stream(new Developer1[]{developer1}).filter(developer11 -> developer11.getName().startsWith("An") )
                .filter(developer11 -> developer11.getId()>10) // не печатает ид
                .forEach(System.out::println);
    }
}

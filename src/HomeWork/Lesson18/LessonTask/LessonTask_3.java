package HomeWork.Lesson18.LessonTask;

import HomeWork.Lesson18.LessonTask.Developer1;

import java.util.stream.Stream;

public class LessonTask_3 {
    public static void main(String[] args) {
        Developer1 developer1 = new Developer1();
        Stream.of(developer1).filter(developer11 -> developer11.getName().startsWith("An"))
                .filter(developer12 -> developer12.hashCode()>10) // не печатает ид
                .forEach(System.out::println);
    }
}

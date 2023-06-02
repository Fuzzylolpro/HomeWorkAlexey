package Lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String line = "Hello world!";
        // System.out.println(line.length());// длина
        //System.out.println(line.trim()); // убирает пробелы с обех сторон
        //System.out.println(line.charAt(3)); // символ по индексу
        //System.out.println(line.indexOf("o")); // нахождения символа в строке
        //System.out.println(line.concat("We are learning Java!")); // конкатенация строк , складывает сроки +
        //System.out.println(line.substring(3)); // c 3 индекса и до конца
        //System.out.println(line.substring(2,5)); // c 2 по 5
        // System.out.println(line.equals("Group 67")); // сравнивание строк
        //System.out.println(line.equalsIgnoreCase("Group 67")); // сравнивание строк без регистров
        //System.out.println(line.compareTo("Group 67!")); // символьное сравнение строк
        //System.out.println(line.toUpperCase()); // привести в верхний регистр Все большое
        //System.out.println(line.toLowerCase()); // привести в нижний регистр
        //System.out.println(line.replace("6","8")); //замена буквы
        //System.out.println(line.replaceAll("[0-9]{3}","8")); // может менять цифры на нужное
        //System.out.println(line.getBytes()); // преобразовать в byte[]
        //System.out.println(Arrays.toString(line.toCharArray()));
        //System.out.println(Arrays.toString(line.split(" "))); String[]
        //System.out.println(line.startsWith("Group")); // начинается ли строка с
        //System.out.println(line.endsWith("Group")); // заканчивется ли строка на
        //System.out.println(line.contains("Gr")); // содержит ли строка
        //System.out.println(line.isEmpty()); // проверяет на пустоту строки (Lenght == 0)
        //System.out.println("    ".isBlank()); // проверяет игнорируя пробел, не учитывает пробелы
        //System.out.println(line.repeat(3)); // повторяет строку n раз
        //System.out.println(line.stripLeading()); // убирает пробелы слева
        //System.out.println(line.stripTrailing()); // убирает пробелы справа
        //System.out.println(line.intern()); // перекладывает обьект из кучи Heap  в String pool
        /*String block = """
                Hello world
                How are you?
                """;
        System.out.println(block);*/
        //String six = String.valueOf(6);
        //System.out.println(six);

        //String line1 = new String("Hello");
        //String poolLine = "Hello";
        StringBuilder strBuiline = new StringBuilder("Hello world!");
        strBuiline.append("This is and of line"); // добавить в конец строки
        strBuiline.delete(4,7); // удалить
        strBuiline.deleteCharAt(4); // удалить 1 символ
        strBuiline.insert(3,"BYE"); //вставить в серидину
        strBuiline.reverse();
        String LineFrom = strBuiline.toString();
        System.out.println(strBuiline);
        //StringBuffer //используется в многопоточном
    }
}

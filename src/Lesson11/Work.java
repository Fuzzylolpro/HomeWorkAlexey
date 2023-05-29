package Lesson11;

public class Work {
    public static void main(String[] args) {
        //String line = "My name Alex";
        //String line1 = "my name Alex";
        //System.out.println(line.equals(line1));
        //System.out.println(line.equalsIgnoreCase(line1));
        //System.out.println(line.substring(3));
        //System.out.println(line.length());
        //System.out.println(line.indexOf("A"));

        /*1.1 Объединить 2 строки в одну 2-мя способами. //
        1.2 Проверить 2 строки на равенство с и без учета регистра.
        1.3 Вернуть подстроку с 3-го символа до конца.
        1.4 Вывести длину строки
        1.5 Вывести порядковый номер любого символа в строке.
        1.6 Преобразовать логический тип true к строке. //
        1.7 Перевести строку в верхний регистр.
        1.8 Заменить ‘1’ в строке на ‘%’.
        1.9 Убрать все пробелы в строке с двух сторон.
        1.10 Проверить, пустая ли строка.
        1.11 Разбить строку на несколько по делителю.*/

        StringBuilder line = new StringBuilder("Hello world!");
        line.append("xxxx");
        line.insert(5,"y");
        line.delete(3,6);
        line.reverse();
        System.out.println(line);
        String line1 = line.toString();
        System.out.println(line1);

    }
}

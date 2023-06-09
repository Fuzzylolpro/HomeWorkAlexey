package Lesson14;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        File file = new File("D:\\tms.txt");

        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(text.getBytes());
        outputStream.close();

        FileReader fr = new FileReader(file);
        int i;
        StringBuilder newLine= new StringBuilder();
        while ((i = fr.read()) !=-1){
            newLine.append((char) i);
        }
        fr.close();
        System.out.println(newLine.toString().replaceAll(" +", "_"));
    }
}

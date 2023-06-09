package Lesson14;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\newFile.txt");
       // String text = "Hello group 67! Привет привет.";

       //FileOutputStream outputStream = new FileOutputStream(file);
       //outputStream.write(text.getBytes());
       //outputStream.close();
        //int i;
        //FileInputStream fileInputStream = new FileInputStream(file);
        //while ((i = fileInputStream.read()) !=-1){
        //    System.out.print((char) i);
        //}
        //fileInputStream.close();

        //FileReader fr = new FileReader(file);
        //int i;
        //while ((i = fr.read()) !=-1){
        //    System.out.print((char) i);
        //}
        //fr.close();

        try(FileWriter fw = new FileWriter(file)) { //флаг тру записываем дальше
            fw.write("Hello world!");
            fw.write("Hello ufufufufufu");
            fw.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

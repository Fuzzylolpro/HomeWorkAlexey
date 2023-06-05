package Lesson13;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws MyFirstException {
        /*int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println(11111);
        }*/
        try {
            FileInputStream s = new FileInputStream("D\\file.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
        int i = 1;
        if (i > 0){
            throw new MyFirstException("more 0");
        }

    }
}


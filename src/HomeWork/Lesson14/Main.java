package HomeWork.Lesson14;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("B:\\lengthsWord.txt");
        File file1 = new File("B:\\romeo-and-juliet.txt");
        try (FileReader fr = new FileReader("B:\\romeo-and-juliet.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

            FileInputStream inputStream = new FileInputStream(file1);
            String longWords = inputStream.toString();
            System.out.println(longWords.length());

        String[]words=longWords.split(" ");
        String resstring="";
        for(String word: words)
        {
            if(word.length()>resstring.length())
                resstring=word;
            System.out.println(word);
        }
       // FileOutputStream outputStream = new FileOutputStream(file);



    }
}


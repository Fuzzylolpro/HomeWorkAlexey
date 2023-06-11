package HomeWork.Lesson14;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("B:\\romeo-and-juliet.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("B:\\romeo-and-juliet.txt"));
            String line = br.readLine();
            String longestWord = "";
            while (line != null) {
                String[] words = line.split("\\s");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                        //Pattern p = Pattern.compile("[a-zA-Z]");
                        //Matcher m = p.matcher(longestWord);
                        //m.matches();
                    }
                }
                line = br.readLine();
            }
            FileWriter fw = new FileWriter("B:\\lengthsWord.txt");
            fw.write(longestWord);
            fw.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
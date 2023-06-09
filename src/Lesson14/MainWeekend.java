package Lesson14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainWeekend {
    public static void main(String[] args) throws Exception {
        Weekend weekend = new Weekend();
        weekend.name = "Friday";
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\week.txt"));
        outputStream.writeObject(weekend);
        outputStream.close();
    }
}

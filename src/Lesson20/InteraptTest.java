package Lesson20;

import java.time.LocalTime;

public class InteraptTest extends Thread{
    int a = 1;
    @Override
    public void run() {
        while (!isInterrupted()){
            System.out.println(a++);
        }
        System.out.println("Поток закрывается");
    }
}

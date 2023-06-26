package Lesson20;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Second thread working...");
    }
}

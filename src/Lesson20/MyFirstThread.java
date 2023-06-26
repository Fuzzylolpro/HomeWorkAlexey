package Lesson20;

public class MyFirstThread extends Thread {
    @Override
    public void run() { // не путать с start()
        //Все что тут, будет выполнятся потоком.
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

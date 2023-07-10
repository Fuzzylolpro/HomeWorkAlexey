package Lesson20;

public class MyFirstThread extends Thread {
    @Override
    public void run() { // не путать с start()
        //Все что тут, будет выполнятся потоком.
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


package Lesson20;

public class MainCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 5; i++) {
            Thread nft = new Thread(new CounterThread(counter));
            nft.start();
        }
    }
}

package Lesson20;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       // System.out.println("Поток main начинает свою работу");

        /*for (int i=0;i<20;i++){

            MyFirstThread mft = new MyFirstThread();
            mft.start();
            mft.join(); // поток-создатель ожидает завершения созданного потока
        }*/
        //анонимный класс
       /*Thread t = new Thread(() -> System.out.println("MultiThreading :)"));
       t.start();
       System.out.println("Поток main завершает свою работу");*/

       // Thread t = new Thread(){
       //     @Override
       //     public void run(){
       //         System.out.println("Me thread");
       //     }
       // };
       // t.start();
       // t.setName("c65-thread");
       // t.setPriority(10);
       // System.out.println(t.getId());
       // System.out.println(t);



        //Thread thread = new Thread(new MyFirstThread());
        //System.out.println(thread.isAlive());
        //thread.start();
        //System.out.println(thread.isAlive());

        //thread.interrupt();
        //thread.isInterrupted()

        //InteraptTest interaptTest = new InteraptTest();
        //interaptTest.start();
//
        //Thread.sleep(10000);
//
        //interaptTest.interrupt();

        //MyFirstThread m = new MyFirstThread();
        //m.setDaemon(true); // перед стартом потока, закрывается с потоком мэйн
        //m.start();



    }
}

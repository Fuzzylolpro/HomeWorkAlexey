package Lesson13;

public class MyFirstException extends Exception{
    String info;

    public MyFirstException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Hello,this is Exception: " + info;
    }
}

package HomeWork.Lesson13;

public class WrongLoginException extends Exception {
    String info;
    public WrongLoginException(){

    }


    public void MyFirstException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Login do not match " + info;
    }
}

package HomeWork.Lesson13;

public class WrongPasswordException extends Exception {
    String info;
    public WrongPasswordException(){

    }
    public WrongPasswordException(String info) {
        this.info = info;
    }

    public void MyFirstException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Passwords do not match " + info;
    }

}

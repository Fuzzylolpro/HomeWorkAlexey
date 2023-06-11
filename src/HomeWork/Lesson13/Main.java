package HomeWork.Lesson13;

public class Main {
    public static void main(String[] args) throws wrongLoginException, wrongPasswordException {
        User user = new User();
        User.validate("Fuzzywuzzy","123456qwe","123456qwe");
    }
}

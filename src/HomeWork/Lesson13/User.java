package HomeWork.Lesson13;

public class User {
    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        try {
            // Проверяем login
            if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
                throw new WrongLoginException();
            }
            // Проверяем password
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
                throw new WrongPasswordException("Неверно");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

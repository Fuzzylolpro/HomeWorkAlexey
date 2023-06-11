package HomeWork.Lesson13;

public class User {
    /*public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
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
    }*/
        public static boolean validate(String login, String password, String confirmPassword) throws wrongLoginException, wrongPasswordException {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new wrongLoginException("Login should be less than 20 characters and not contain spaces.");
            }
            if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
                throw new wrongPasswordException("Password should be less than 20 characters, not contain spaces, contain at least one number, and match confirm password.");
            }
            return true;
        }
    }

    class wrongLoginException extends Exception {
        public wrongLoginException() {
            super();
        }
        public wrongLoginException(String message) {
            super(message);
        }
    }

    class wrongPasswordException extends Exception {
        public wrongPasswordException() {
            super();
        }
        public wrongPasswordException(String message) {
            super(message);
        }
    }


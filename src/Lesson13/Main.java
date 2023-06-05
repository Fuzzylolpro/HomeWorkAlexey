package Lesson13;

public class Main {
    public static void main(String[] args) {
        //подключаемся к БД
        //try-catch
        int  number = 0;
        try {
            System.out.println(10/number);
        } catch (ArithmeticException exception){
            System.out.println("Some arithmetic exception!!!" + exception);
        } catch (RuntimeException e){
            System.out.println("Some arithmetic exception!!!" + e);
        }
        System.out.println("End");
    }
}

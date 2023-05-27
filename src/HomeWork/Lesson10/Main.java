package HomeWork.Lesson10;

import Lesson8.Person;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User();
        User user2 = new User();
        System.out.println(user == user1);
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
        user.setAge(5);
        user.setName("Alex");
        System.out.println(user.hashCode());
        System.out.println(user.toString());
    }
}

package Lesson18;

import java.util.Objects;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("alex");
        Optional<User> user0 = Optional.ofNullable(user);
        String task = user0.map(a -> a.getName()).orElse("Default");
        System.out.println(task);
    }
}

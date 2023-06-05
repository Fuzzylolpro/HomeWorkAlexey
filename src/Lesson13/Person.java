package Lesson13;

public class Person {
    private int age;

    public Person(int age) {
        if (age < 18) {
            try {
                throw new Exception18(age);
            } catch (Exception18 e){
                e.printStackTrace();
            }
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

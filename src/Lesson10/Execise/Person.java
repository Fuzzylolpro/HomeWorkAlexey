package Lesson10.Execise;

import java.util.Date;
import java.util.Objects;

public class Person implements Cloneable{
    String name = "Alex";
    int age = 10;
    int mounthCash = 200;
    Cat cat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && mounthCash == person.mounthCash && Objects.equals(name, person.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mounthCash=" + mounthCash +
                ", cat=" + cat +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMounthCash() {
        return mounthCash;
    }

    public void setMounthCash(int mounthCash) {
        this.mounthCash = mounthCash;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return (int)(31*name.hashCode()*(new Date().getTime()));

    }
}

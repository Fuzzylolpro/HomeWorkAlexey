package Lesson10.Execise;

public class main extends Person implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person newPerson = (Person) person.clone();
        newPerson.setName("Dima");
        person.toString();
        System.out.println(person);
        System.out.println(person.hashCode());
        System.out.println(person);
        System.out.println(newPerson);
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

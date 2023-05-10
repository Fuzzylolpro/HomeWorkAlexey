public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Петров",25);
        person1.move();
        person1.talk(" Hello ");
        person2.move();
        person2.talk(" GO Hello ");

    }
}
package Lesson15;

public class MainGeneric {
    public static void main(String[] args) {
        //GenericExample<Integer> o = new GenericExample<>();
        //GenericExample<Person> o1 = new GenericExample<>();
        //GenericExample<Person, Double> o2 = new GenericExample<>();
        System.out.println(hashSumm(new Person(),new Person()));
    }
    static <T> Integer hashSumm(T ... object){
        int summ = 0;
        for (T o :object){
            summ = summ +o.hashCode();
        }
        return summ;
    }
}

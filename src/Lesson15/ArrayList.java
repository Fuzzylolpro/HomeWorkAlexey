package Lesson15;

public class ArrayList {
    public static void main(String[] args) {
        //может хранить дубликаты
        //время доступа к элементу 0(1)- очень быстро
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        java.util.ArrayList<String> list2 = new java.util.ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Group");
        list.add("67");
        list.add("67");
        //System.out.println(list.isEmpty());
        System.out.println(list.set(4,"!!!"));
        //System.out.println(list.remove("67")); //удалит
        System.out.println(list.indexOf("Hello"));
        System.out.println(list.contains("Hello"));
        System.out.println(list.size());
        System.out.println(list.addAll(list2));
        System.out.println(list.get(3));

        String[] result = list.toArray(new String[list.size()]);
    }
}

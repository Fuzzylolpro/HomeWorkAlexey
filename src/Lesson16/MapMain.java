package Lesson16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("FirstKey",100);//положить
        map.put("SecondKey",105);

        System.out.println(map.get("SecondKey"));
        map.remove("123");
        map.remove("SecondKey",111);
        //map.clear();//очистить мапу
        Set<String> resKey = map.keySet();  //достать ключи
        ArrayList<Integer> resValue = new ArrayList<>(map.values()); //достать значения в ArrayList
        System.out.println(map.containsKey("123"));
        map.size();//сколько элементов
        map.replace("FirstKey", 125);

        System.out.println(map);
    }
}

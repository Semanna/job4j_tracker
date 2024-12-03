package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("annasemenova@mail.ru", "Semenova Anna Petrovna");
        map.put("kulikov123@internet.ru", "Kulikov Maxim Leonidovich");
        map.put("ananas86@mail.ru", "Kovaleva Anastasia Valeryevna");
        map.put("annasemenova@mail.ru", "Frfrfr Meow Meow");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}

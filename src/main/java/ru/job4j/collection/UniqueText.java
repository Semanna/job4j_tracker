package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();

        for (String origText : origin) {
            check.add(origText);
        }

        for (String myText : text) {
            if (!check.contains(myText)) {
                return false;
            }
        }
        return result;
    }
}
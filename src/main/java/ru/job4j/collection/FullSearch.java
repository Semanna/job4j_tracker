package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {

    public Set<String> extractNumber(List<Task> tasks) {

        Set<String> unique = new HashSet<>();
        for (Task task : tasks) {
            unique.add(task.getNumber());
        }
        return unique;
    }
}

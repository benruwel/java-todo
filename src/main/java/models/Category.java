package models;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String name;
    private int id;
    private List<Task> tasksList;
    private static List<Category> instances = new ArrayList<>();

    public Category(String name) {
        this.name = name;
        instances.add(this);

    }
}

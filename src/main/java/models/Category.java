package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category {

    private String name;
    private int id;
    private List<Task> tasksList;
    private static List<Category> instances = new ArrayList<>();

    public Category(String name) {
        this.name = name;
        instances.add(this);

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (completed != category.completed) return false;
        if (id != task.id) return false;
        return description.equals(task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getCompleted(), getId());
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
}

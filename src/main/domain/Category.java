package main.domain;

import java.util.Objects;
import java.util.UUID;

public class Category {
    private String id;
    private String name;

    public Category(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "\nCategory{" +
                ", id: " + id.substring(0, 8) +
                ", name='" + name + '\'' +
                '}';
    }
}

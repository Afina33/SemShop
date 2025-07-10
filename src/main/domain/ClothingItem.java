package main.domain;

import java.util.Objects;
import java.util.UUID;

public class ClothingItem {
    private final String id;
    private String name;
    private String size;
    private String color;
    private String category;
    private double price;

    public ClothingItem(String name, String size, String color, String category, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ClothingItem tempClothing = (ClothingItem) obj;
        return Objects.equals(id, tempClothing.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

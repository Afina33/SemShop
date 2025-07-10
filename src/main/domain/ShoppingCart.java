package main.domain;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
     private final List<ClothingItem>items;

    public ShoppingCart() {
        this.items = new  ArrayList<>();
    }

    public void addItem(ClothingItem item){
        if (item != null){
            items.add(item);
            System.out.println("\t\t -> Товар \"" + item.getName() + "\" добавлен в корзину. ");
        }
    }

    public boolean removeItem(String itemId){
        boolean removed = items.removeIf(item -> item.getId().equals(itemId));
        if (removed){
            System.out.println("\t\t -> Товар с ID: " + itemId.substring(0,8) + " удалён из корзины.");
        }else {
            System.out.println("\t\t -> Товар с ID: " + itemId.substring(0,8) + " не найден в корзине.");
        }
        return removed;
    }

}

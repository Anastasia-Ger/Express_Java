package practice_5.task3_restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
private List<Dish> menu = new ArrayList<>();
public void addDishToMenu(Dish dish) {
    menu.add(dish);
}
public void printMenu() {
    for(Dish dish: menu) {
        System.out.println(dish);
    }
}
}

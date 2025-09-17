package practice_5.task3_restaurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        HotDish steak = new HotDish("Steak", 50);
        Drink tea = new Drink("Tea", 250);
        menu.printMenu();
        menu.addDishToMenu(steak);
        menu.addDishToMenu(tea);
        menu.printMenu();
    }
}

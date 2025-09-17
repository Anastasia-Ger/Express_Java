package practice_5.task3_restaurant;

public class HotDish extends Dish {
    private int temperature;
    public HotDish(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "Hot dish: " + getName() + " --- Temperature: " + temperature;
    }

}

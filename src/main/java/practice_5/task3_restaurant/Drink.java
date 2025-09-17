package practice_5.task3_restaurant;

public class Drink extends Dish{
    private int volume;
    public Drink(String name, int volume) {
        super(name);
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Drink: " + getName() + " --- Volume: " + volume;
    }

}

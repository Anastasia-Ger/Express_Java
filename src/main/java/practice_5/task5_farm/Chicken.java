package practice_5.task5_farm;

public class Chicken extends DomesticAnimal implements ServeAnimal{
    @Override
    public String feed() {
        return "Chicken eats grain.";
    }
    @Override
    public  String care() {
        return "Chicken needs grain feeder.";
    }
    @Override
    public String produce() {
        return "Chicken produces eggs.";
    }
}

package practice_5.task5_farm;

public class Cow extends DomesticAnimal implements ServeAnimal{
    @Override
    public String feed() {
        return "Cow eats grass.";
    }
    @Override
    public String care() {
        return "Cow needs grazing.";
    }
    @Override
    public String produce() {
        return "Cow gives milk.";
    }
}

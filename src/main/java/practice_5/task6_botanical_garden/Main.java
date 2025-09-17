package practice_5.task6_botanical_garden;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Cactus cactus = new Cactus();
        Orchid orchid = new Orchid();
        garden.addPlant(cactus);
        garden.addPlant(orchid);
        garden.carePlant(cactus);
        garden.carePlant(orchid);

    }
}

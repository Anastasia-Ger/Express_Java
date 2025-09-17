package practice_5.task5_farm;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Cow cow = new Cow();
        Chicken chicken = new Chicken();
        farm.addAnimalToFarm(chicken);
        farm.addAnimalToFarm(cow);
        farm.serveAnimal(cow);
        farm.serveAnimal(chicken);
    }
}

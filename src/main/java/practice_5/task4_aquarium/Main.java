package practice_5.task4_aquarium;

public class Main {
    public static void main(String[] args) {
        Starfish starfish = new Starfish();
        Shark shark = new Shark();
        AquariumManager manager = new AquariumManager();
        manager.addAnimal(starfish);
        manager.addAnimal(shark);
        manager.showAnimalBehaviour(starfish);
        manager.showAnimalBehaviour(shark);
    }
}

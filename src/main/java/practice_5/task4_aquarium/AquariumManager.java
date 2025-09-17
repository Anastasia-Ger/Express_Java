package practice_5.task4_aquarium;

import java.util.ArrayList;
import java.util.List;

public class AquariumManager {
    private List<SeaAnimal> seaAnimals = new ArrayList<>();
    public void addAnimal(SeaAnimal animal) {
        seaAnimals.add(animal);
    }
    public void showAnimalBehaviour(SeaAnimal animal) {
        Movable m = (Movable) animal;
        System.out.println(m.move());

    }
}

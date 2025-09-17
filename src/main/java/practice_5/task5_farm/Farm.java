package practice_5.task5_farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<DomesticAnimal> animals = new ArrayList<>();
    public void addAnimalToFarm(DomesticAnimal animal) {
        animals.add(animal);
    }
    public void serveAnimal(DomesticAnimal animal) {
        ServeAnimal serveAnimal = (ServeAnimal) animal;
        System.out.println(serveAnimal.care());
        System.out.println(serveAnimal.feed());
        System.out.println(serveAnimal.produce());
    }
}

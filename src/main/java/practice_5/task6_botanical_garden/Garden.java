package practice_5.task6_botanical_garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plants = new ArrayList<>();
    public void addPlant(Plant plant) {
        plants.add(plant);
    }
    public void carePlant(Plant plant) {
        plant.care();
    }
}

package practice_5.task1_zoo;

public class Zookeeper {
    private Animal animal;

    public void addAnimal(Animal newAnimal) {
        this.animal = newAnimal;
        System.out.println("Animal: " + animal + " was added to the zoo.");
    }

    public void removeAnimal() {
        System.out.println("Animal: " + animal + " was removed from the zoo.");
        this.animal = null;
    }

    public void showBehaviourOfAnimal(Animal animal) {
        animal.move();
        animal.makeSound();
    }

}

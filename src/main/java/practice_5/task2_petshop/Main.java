package practice_5.task2_petshop;

public class Main {
    public static void main(String[] args) {
        PetControl petControl = new PetControl();
        Dog dog = new Dog();
        petControl.forceAnimalEat(dog);
        petControl.forceAnimalWalk(dog);

        Cat cat = new Cat();
        petControl.forceAnimalEat(cat);
        petControl.forceAnimalPlay(cat);
    }

}

package practice_5.task2_petshop;

public class PetControl {
    private Pet pet;

    public void forceAnimalPlay(Pet pet) {
        Care care = (Care) pet;
        care.play();
    }

    public void forceAnimalWalk(Pet pet) {
        Care care = (Care) pet;
        care.walk();
    }

    public void forceAnimalEat(Pet pet) {
        Care care = (Care) pet;
        care.eat();
    }

}

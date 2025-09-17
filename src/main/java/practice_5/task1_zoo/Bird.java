package practice_5.task1_zoo;

public class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird tweets.");
    }

    @Override
    public void move() {
        System.out.println("Bird flies.");
    }
}

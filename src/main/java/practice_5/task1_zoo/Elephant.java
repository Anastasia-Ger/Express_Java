package practice_5.task1_zoo;

public class Elephant extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets.");
    }

    @Override
    public void move() {
        System.out.println("Elephant walks");
    }
}

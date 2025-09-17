package practice_5.task2_petshop;

public class Cat extends Pet implements Care {
    @Override
    public void walk() {
        System.out.println("Cat can not walk.");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing.");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating wet food.");
    }

}

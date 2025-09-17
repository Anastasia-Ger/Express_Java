package practice_5.task2_petshop;

public class Dog extends Pet implements Care {
    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }

    @Override
    public void play() {
        System.out.println("Dog can not play.");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating dry food.");
    }

}

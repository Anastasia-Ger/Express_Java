package practice_5.task1_zoo;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Elephant elephant = new Elephant();
        Zookeeper zookeeper = new Zookeeper();
        zookeeper.addAnimal(bird);
        zookeeper.showBehaviourOfAnimal(bird);
        zookeeper.removeAnimal();
        zookeeper.addAnimal(elephant);
        zookeeper.showBehaviourOfAnimal(elephant);
        zookeeper.removeAnimal();

    }
}

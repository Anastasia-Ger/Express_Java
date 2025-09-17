package practice_5.task7_amusement_park;

public class Carousel extends Ride{
    @Override
    public void info() {
        System.out.println("Chill out with a smooth carousel ride!");
    }
    @Override
    public void maintain() {
        System.out.println("Carousel needs technical maintenance.");
    }
}

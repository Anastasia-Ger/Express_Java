package practice_5.task7_amusement_park;

public class RollerCoaster extends Ride{
    @Override
    public void info() {
        System.out.println("Thrills and excitement await on the roller coaster!");
    }
    @Override
    public void maintain() {
        System.out.println("Roller coaster needs safety check.");
    }
}

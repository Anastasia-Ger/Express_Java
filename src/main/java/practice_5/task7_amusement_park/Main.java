package practice_5.task7_amusement_park;

public class Main {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();
        RollerCoaster rollerCoaster = new RollerCoaster();
        Carousel carousel = new Carousel();
        park.addNewRide(rollerCoaster);
        park.addNewRide(carousel);
        park.maintainRide(rollerCoaster);
        park.maintainRide(carousel);
        park.printInfoOnRide(rollerCoaster);
        park.printInfoOnRide(carousel);
    }
}

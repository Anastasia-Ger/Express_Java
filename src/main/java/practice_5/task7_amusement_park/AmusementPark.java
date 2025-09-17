package practice_5.task7_amusement_park;

import java.util.ArrayList;
import java.util.List;

public class AmusementPark {
    private List<Ride> rides = new ArrayList<>();
    public void addNewRide(Ride ride) {
        rides.add(ride);
    }
    public void maintainRide(Ride ride) {
        ride.maintain();
    }
    public void printInfoOnRide(Ride ride) {
        ride.info();
    }
}

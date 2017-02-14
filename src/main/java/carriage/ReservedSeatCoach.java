package carriage;

/**
 * Created by vatva on 14.02.2017.
 */
public class ReservedSeatCoach extends CoachBuilder {
    public void buildCapacity() {
        passengerCoach.setCapacity(54);
    }

    public void buildConvenience() {
        passengerCoach.setConvenience(Convenience.RESERVED_SEAT);
    }

    @Override
    public void buildPrice() {
        passengerCoach.setPrice(94.44);
    }
}

package carriage;

/**
 * Created by vatva on 14.02.2017.
 */
public class CoupeCoach extends CoachBuilder {
    public void buildCapacity() {
        passengerCoach.setConvenience(Convenience.COUPE);
    }

    public void buildConvenience() {
        passengerCoach.setCapacity(36);
    }

    @Override
    public void buildPrice() {
        passengerCoach.setPrice(156.12);
    }
}

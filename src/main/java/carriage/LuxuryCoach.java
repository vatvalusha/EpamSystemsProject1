package carriage;

/**
 * Created by vatva on 14.02.2017.
 */
public class LuxuryCoach extends CoachBuilder {
    @Override
    public void buildPrice() {
        passengerCoach.setPrice(346.37);
    }

    public void buildCapacity() {
        passengerCoach.setCapacity(18);
    }

    public void buildConvenience() {
        passengerCoach.setConvenience(Convenience.LUXURY);
    }

    public void buildPeolpe() {
        passengerCoach.setPeople(passengerCoach.getPeople());
    }
}

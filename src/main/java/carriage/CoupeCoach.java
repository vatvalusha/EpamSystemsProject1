package carriage;

import people.Person;

import java.util.Set;

/**
 * Created by vatva on 14.02.2017.
 */
public class CoupeCoach extends CoachBuilder {
    public void buildConvenience() {
        passengerCoach.setConvenience(Convenience.COUPE);
    }

    public void buildCapacity() {
        passengerCoach.setCapacity(36);
    }

    public void buildPeolpe() {
        passengerCoach.setPeople(passengerCoach.getPeople());
    }

    @Override
    public void buildPrice() {
        passengerCoach.setPrice(156.12);
    }
}

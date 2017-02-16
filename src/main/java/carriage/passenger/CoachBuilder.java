package carriage.passenger;

/**
 * Created by vatva on 14.02.2017.
 */

/*Abstract Builder*/
public abstract class CoachBuilder {
    protected PassengerCoach passengerCoach;

    public PassengerCoach getPassengerCoach() {
        return passengerCoach;
    }

    public void creatPassengerCoach() {
        passengerCoach = new PassengerCoach();
    }

    public abstract void buildPeolpe();

    public abstract void buildPrice();

    public abstract void buildCapacity();

    public abstract void buildConvenience();
}

package carriage.passenger;

/**
 * Created by vatva on 14.02.2017.
 */
public class Director {

    private CoachBuilder coachBuilder;

    public void setCoachBuilder(CoachBuilder coachBuilder) {
        this.coachBuilder = coachBuilder;
    }

    public PassengerCoach getPassengerCoach() {
        return coachBuilder.getPassengerCoach();
    }

    public PassengerCoach buildCoach() {
        coachBuilder.createPassengerCoach();
        coachBuilder.buildCapacity();
        coachBuilder.buildConvenience();
        coachBuilder.buildPrice();
        coachBuilder.buildPeolpe();


        PassengerCoach passengerCoach = coachBuilder.getPassengerCoach();
        passengerCoach.addPeople();
        return passengerCoach;
    }
}

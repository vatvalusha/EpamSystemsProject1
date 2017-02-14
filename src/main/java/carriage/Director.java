package carriage;

/**
 * Created by vatva on 14.02.2017.
 */
public class Director {

    private CoachBuilder coachBuilder;

    public void setCoachBuilder(CoachBuilder coachBuilder){
        this.coachBuilder = coachBuilder;
    }
    public PassengerCoach getPassengerCoach(){
        return coachBuilder.getPassengerCoach();
    }

    public PassengerCoach buildCoach(){
        coachBuilder.creatPassengerCoach();
        coachBuilder.buildCapacity();
        coachBuilder.buildConvenience();
        coachBuilder.buildPrice();
        PassengerCoach passengerCoach = coachBuilder.getPassengerCoach();
        return passengerCoach;
    }
}

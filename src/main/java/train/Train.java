package train;

import carriage.Director;
import carriage.PassengerCoach;
import carriage.RailwayСarriage;

import java.util.*;

/**
 * Created by vatva on 14.02.2017.
 */
public class Train {
    List<PassengerCoach> coaches= new ArrayList<PassengerCoach>();

    public void addCoach(PassengerCoach coach){
        coaches.add(coach);
    }

    public int countFreeSeats() {
        int counter = 0;
        for (PassengerCoach coach:coaches){
            for(int i = 0; i<coach.getPeople().length;i++){
                if(coach.getPeople()[i] == null) counter++;
            }
        }

        return counter;
    }
    public List<PassengerCoach> sortCoachLuxury(List<PassengerCoach> coach) {
        Collections.sort(coach, new PassengerCoach());
        return coach;
    }

    public static PassengerCoach createCoach( PassengerCoach passengerCoach){

        Director director = new Director();
        director.setCoachBuilder(PassengerCoach.createrCoach());
        passengerCoach = director.buildCoach();
        return passengerCoach;
    }

    public List<PassengerCoach> findCoach(int min, int max){
        List<PassengerCoach> coach = new ArrayList<PassengerCoach>();
        int counter = 0;
        for (int i = 0; i<coaches.size();i++){
            for(int j = 0; j<coaches.get(i).getPeople().length;j++) {
                if (this.coaches.get(i).getPeople()[j] != null) counter++;
            }
                if(counter>=min && counter<=max)
                    coach.add(coaches.get(i));
            counter=0;
            }
        return coach;
    }

    public int countPeopleInTrain() {
        int counter = 0;
        for (PassengerCoach coach:coaches){
            for(int i = 0; i<coach.getPeople().length;i++){
                if(coach.getPeople()[i] != null) counter++;
            }
        }

        return counter;
    }

    public List<PassengerCoach> getCoaches() {
        return coaches;
    }

    @Override
    public String toString() {
        return "Train{" +
                "coaches=" + coaches +
                '}';
    }

    public void setCoaches(List<PassengerCoach> coaches) {
        this.coaches = coaches;
    }
}

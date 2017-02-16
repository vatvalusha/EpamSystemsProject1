package train;

import carriage.RailwayСarriage;
import carriage.cargo.CargoCoach;
import carriage.cargo.DirectorCargo;
import carriage.passenger.Director;
import carriage.passenger.PassengerCoach;

import java.util.*;

/**
 * Created by vatva on 14.02.2017.
 */
public class Train {
    private List<PassengerCoach> coaches = new ArrayList<PassengerCoach>();
    private List<CargoCoach> cargoCoaches = new ArrayList<CargoCoach>();

    public void addCoach(PassengerCoach coach) {
        coaches.add(coach);
    }

    public void removeCoach() {
        if(coaches.isEmpty()) {
            System.out.println("Train is empty");
            return;
        }
        else
            coaches.remove(coaches.size() - 1);
    }

    public int countFreeSeats() {
        int counter = 0;
        for (PassengerCoach coach : coaches) {
            for (int i = 0; i < coach.getPeople().length; i++) {
                if (coach.getPeople()[i] == null) counter++;
            }
        }

        return counter;
    }

    public List<PassengerCoach> sortCoachLuxury(List<PassengerCoach> coach) {
        Collections.sort(coach, new PassengerCoach());
        coaches = coach;
        return coaches;
    }


    public static CargoCoach createBagCoach(CargoCoach cargoCoach) {
        DirectorCargo directorCargo = new DirectorCargo();
        directorCargo.setCoachBuilder(CargoCoach.createrCoachBag());
        cargoCoach = directorCargo.buildCoach();
        return cargoCoach;
    }

    public static PassengerCoach createCoach(PassengerCoach passengerCoach) {
        Director director = new Director();
        director.setCoachBuilder(PassengerCoach.createrCoach());
        passengerCoach = director.buildCoach();
        return passengerCoach;
    }

    public List<PassengerCoach> findCoach(int min, int max) {
        List<PassengerCoach> coach = new ArrayList<PassengerCoach>();
        int counter = 0;
        for (int i = 0; i < coaches.size(); i++) {
            for (int j = 0; j < coaches.get(i).getPeople().length; j++) {
                if (this.coaches.get(i).getPeople()[j] != null) counter++;
            }
            if (counter >= min && counter <= max)
                coach.add(coaches.get(i));
            counter = 0;
        }
        return coach;
    }

    public void showOrderLuxury(List<PassengerCoach> coaches) {
        for (int i = 0; i < coaches.size(); i++) {
            System.out.print((i + 1) + "." + coaches.get(i).getConvenience() + "--");
        }
        System.out.println();
    }

    public int countPeopleInTrain() {
        int counter = 0;
        for (PassengerCoach coach : coaches) {
            for (int i = 0; i < coach.getPeople().length; i++) {
                if (coach.getPeople()[i] != null) counter++;
            }
        }
        return counter;
    }
    public int countBag(){
        int counter = 0;
        for(CargoCoach cargo : cargoCoaches){
            for(int i = 0; i<cargo.getCargos().length;i++){
                if(cargo.getCargos()[i] != null) counter++;
            }
        }
        return counter;
    }
    public int countTotalWeight(){
        int weight = 0;
        for(CargoCoach cargo : cargoCoaches){
            for(int i = 0; i<cargo.getCargos().length;i++){
                if(cargo.getCargos()[i] != null)
                    weight = weight + cargo.getCargos()[i].getWeight();
            }
        }
        return weight;
    }

    public List<PassengerCoach> getCoaches() {
        return coaches;
    }

    public List<CargoCoach> getCargoCoaches() {
        return cargoCoaches;
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

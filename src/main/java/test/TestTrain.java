package test;

import carriage.passenger.PassengerCoach;
import train.Train;

import java.util.List;

/**
 * Created by vatva on 15.02.2017.
 */
public class TestTrain {
    static PassengerCoach passengerCoach = new PassengerCoach();

    public static void main(String[] args) {
        Train train = new Train();
        for (int i = 0; i < 16; i++) {
            train.getCoaches().add(Train.createCoach(passengerCoach));
        }
        System.out.print("Count busy place in train: ");
//        System.out.println(train.countPeopleInTrain());

//        for (PassengerCoach i : train.getCoaches()) {
//            for(int j = 0;j<i.getPeople().length;j++){
//                System.out.println(i.getPeople()[j]);
//            }
//        }
        System.out.println("--------------------------");
        List<PassengerCoach> distance =  train.findCoach(30,54);
        train.setCoaches(distance);
        for (PassengerCoach i : distance) {
            System.out.print(i.getConvenience() + "---");
        }
    }


}

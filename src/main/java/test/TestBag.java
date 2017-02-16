package test;

import cargo.CargoBuilder;
import carriage.RailwayСarriage;
import carriage.cargo.CargoCoach;
import train.Train;

import java.util.ArrayList;
import java.util.List;

import static test.TestTrain.passengerCoach;

/**
 * Created by vatva on 16.02.2017.
 */
public class TestBag {


    public static void main(String[] args) {
        CargoCoach cargoCoach = new CargoCoach();
        Train train = new Train();
        List<RailwayСarriage> listTrain = new ArrayList<RailwayСarriage>();

        System.out.println(new CargoBuilder().build());

        System.out.println(Train.createCoach(passengerCoach));
        for(int i =0; i<2;i++) {
            train.getCargoCoaches().add(Train.createBagCoach(cargoCoach));
        }
        System.out.println(train.getCargoCoaches());
        System.out.println(train.countTotalWeight());
        System.out.println(train.countBag());
    }
}

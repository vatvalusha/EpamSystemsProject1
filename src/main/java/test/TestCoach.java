package test;

import carriage.*;
import sort.MyComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by vatva on 14.02.2017.
 */
public class TestCoach {
    public static void main(String[] args) {
//        ArrayList<PassengerCoach> list = new ArrayList<PassengerCoach>();
//        PassengerCoach[] passengerCoaches = new PassengerCoach[15];
//        for (int i = 0; i < passengerCoaches.length; i++) {
//            Director director = new Director();
//            director.setCoachBuilder(createrCoach());
//            passengerCoaches[i] = director.buildCoach();
//            list.add(passengerCoaches[i]);
//        }
//
////        System.out.println(list.size());
//        for (PassengerCoach i : list) {
//            System.out.println(i.getConvenience());
//        }
//
//        Collections.sort(list, new PassengerCoach());
//
//        System.out.println("SORT");
//        for (PassengerCoach i : list) {
//            System.out.println(i.getConvenience());
//        }

        PassengerCoach passengerCoach = new PassengerCoach();
        Director director = new Director();
        director.setCoachBuilder(PassengerCoach.createrCoach());
        passengerCoach = director.buildCoach();
        System.out.println(passengerCoach.getPeople().length);
        for (int i = 0; i < passengerCoach.getPeople().length; i++) {
            System.out.print("N:" + i);
            System.out.println(passengerCoach.getPeople()[i]);
        }

//        System.out.println(passengerCoach);
    }


}

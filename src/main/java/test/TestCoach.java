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
        ArrayList<PassengerCoach> list = new ArrayList<PassengerCoach>();
        PassengerCoach[] passengerCoaches = new PassengerCoach[15];
        for (int i = 0; i < passengerCoaches.length; i++) {
            Director director = new Director();
            director.setCoachBuilder(createrCoach());
            passengerCoaches[i] = director.buildCoach();
            list.add(passengerCoaches[i]);
        }

//        System.out.println(list.size());
        for (PassengerCoach i : list) {
            System.out.println(i.getConvenience());
        }

        Collections.sort(list, new PassengerCoach());

        System.out.println("SORT");
        for (PassengerCoach i : list) {
            System.out.println(i.getConvenience());
        }

    }

    static CoachBuilder createrCoach() {
        int i = (int) (Math.random() * 3);
        switch (i) {
            case 0:
                return new LuxuryCoach();
            case 1:
                return new CoupeCoach();
            case 2:
                return new ReservedSeatCoach();
        }
        return null;
    }
}

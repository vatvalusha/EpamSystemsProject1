package train;

import carriage.cargo.CargoCoach;
import carriage.passenger.PassengerCoach;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static carriage.Convenience.*;
import static org.junit.Assert.*;
import static train.TrainView.cargoCoach;
import static train.TrainView.passengerCoach;

/**
 * Created by vatva on 16.02.2017.
 */

public class TrainTest implements Comparator<PassengerCoach> {
    private Train train;

    List<PassengerCoach> expected;

    @Before
    public void init() {
        train = new Train();


    }

    @After
    public void tearDown() {
        train = null;
        expected = null;
    }

    @org.junit.Test
    public void addCoach() throws Exception {
        for (int i = 0; i < 11; i++) {
            train.getCoaches().add(Train.createCoach(passengerCoach));
        }
        expected = train.getCoaches();
        expected.add(Train.createCoach(passengerCoach));
        train.getCoaches().add(Train.createCoach(passengerCoach));
        assertEquals(expected.size(), train.getCoaches().size());
    }

    @org.junit.Test
    public void removeCoach() throws Exception {
        for (int i = 0; i < 11; i++) {
            train.getCoaches().add(Train.createCoach(passengerCoach));
        }
        List<PassengerCoach> execute = train.getCoaches();
        execute.remove(execute.size() - 1);
        train.removeCoach();
        assertEquals(execute.size(), train.getCoaches().size());
    }

    @Test(expected = NullPointerException.class)
    public void removeCoachEmptyListTest() {
        train.removeCoach();
    }

    @Test
    public void sortCoachLuxuryTest() {
        for (int i = 0; i < 11; i++) {
            train.getCoaches().add(Train.createCoach(passengerCoach));
        }
        List<PassengerCoach> testList = train.getCoaches();
        Collections.sort(testList, new TrainTest());
        train.sortCoachLuxury(train.getCoaches());
        assertEquals(testList, train.getCoaches());
    }

    @Test
    public void countPeopleInTrainTest() {
        int i;
        train.getCoaches().add(Train.createCoach(passengerCoach));
        if (train.getCoaches().get(0).getConvenience() == LUXURY) i = 18;
        else if (train.getCoaches().get(0).getConvenience() == COUPE) i = 36;
        else i = 54;
        assertTrue(i >= train.countPeopleInTrain());
    }

    @Test
    public void countTotalWeight() {
        for (int i = 0; i < 2; i++) {
            train.getCargoCoaches().add(Train.createBagCoach(cargoCoach));
        }
        List<CargoCoach> cargoCoaches = train.getCargoCoaches();
        int actually = train.countTotalWeight();
        int expected = 0;
        for (CargoCoach cargo : cargoCoaches) {
            for (int i = 0; i < cargo.getCargos().length; i++) {
                if (cargo.getCargos()[i] != null)
                    expected += cargo.getCargos()[i].getWeight();
            }
        }
        assertEquals(expected, actually);
    }

    @Test
    public void countBagInCargoCoachTest() {
        int counter = 0;
        for (int i = 0; i < 2; i++) {
            train.getCargoCoaches().add(Train.createBagCoach(cargoCoach));
        }

        List<CargoCoach> cargoCoaches = train.getCargoCoaches();
        int actually = train.countBag();
        int expected = 0;
        for (CargoCoach coach : cargoCoaches) {
            for (int i = 0; i < coach.getCargos().length; i++) {
                if (coach.getCargos()[i] != null) counter++;
            }
        }
        expected = counter;
        assertEquals(expected, actually);
    }

    public int compare(PassengerCoach o1, PassengerCoach o2) {
        return Integer.compare(o1.getConvenience().getPrior(), o2.getConvenience().getPrior());
    }
}
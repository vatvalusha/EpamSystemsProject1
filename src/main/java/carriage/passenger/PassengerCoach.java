package carriage.passenger;

import carriage.Convenience;
import carriage.RailwayСarriage;
import people.Person;

import java.util.*;

/**
 * Created by vatva on 14.02.2017.
 */
/*---Product---*/
public class PassengerCoach implements RailwayСarriage, Comparator<PassengerCoach> {


    private Person[] people;
    private int capacity;
    private Convenience convenience;
    private double price;


    public void setPeople(final Person[] people) {
        this.people = new Person[capacity];
    }

    public void addPeople() {
        int random = (int) (10 + Math.random() * (people.length - 10));
        for (int i = 0; i < random; i++) {
            people[i] = Person.createPerson();
        }
    }

    public int compare(PassengerCoach o1, PassengerCoach o2) {
        return Integer.compare(o1.getConvenience().getPrior(), o2.getConvenience().getPrior());
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setConvenience(Convenience convenience) {
        this.convenience = convenience;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Convenience getConvenience() {
        return convenience;
    }

    @Override
    public String toString() {
        return "PassengerCoach{" +
                "people=" + Arrays.toString(people) +
                ", capacity=" + capacity +
                ", convenience=" + convenience +
                ", price=" + price +
                '}';
    }

    public Person[] getPeople() {
        return people;
    }

    public static CoachBuilder createrCoach() {
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

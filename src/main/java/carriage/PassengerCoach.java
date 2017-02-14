package carriage;

import people.Person;

import java.util.Comparator;
import java.util.Set;

/**
 * Created by vatva on 14.02.2017.
 */
/*---Product---*/
public class PassengerCoach implements WagonTrain, Comparator<PassengerCoach> {

    private Set<Person> people;
    private int capacity;
    private Convenience convenience;
    private double price;

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
                "capacity=" + capacity +
                ", convenience=" + convenience +
                ", price=" + price +
                '}';
    }

    public int compare(PassengerCoach o1, PassengerCoach o2) {
        return Integer.compare(o1.getConvenience().getPrior(),o2.getConvenience().getPrior());
    }
}

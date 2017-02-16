package carriage.cargo;

import cargo.Cargo;
import carriage.Convenience;
import carriage.RailwayСarriage;
import people.Person;

import java.util.Arrays;


/**
 * Created by vatva on 14.02.2017.
 */
/*--Product--*/
public class CargoCoach implements RailwayСarriage{
    private Cargo[] cargo;
    private int capacity;
    private Convenience convenience;

    public void addCargo(){
        int random = (int) (10 + Math.random() * (cargo.length - 10));
        for (int i = 0; i < random; i++) {
            cargo[i] = Cargo.createCargo();
        }
    }

    public void setCargo(final Cargo[] cargo) {
        this.cargo = new Cargo[capacity];
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setConvenience(Convenience convenience) {
        this.convenience = convenience;
    }

    public Cargo[] getCargos() {
        return cargo;
    }

    @Override
    public String toString() {
        return "CargoCoach{" +
                "cargos=" + Arrays.toString(cargo) +
                ", capacity=" + capacity +
                ", convenience=" + convenience +
                '}';
    }

    public static CoachBuildCargo createrCoachBag() {
    return new BagCoach();
    }
}

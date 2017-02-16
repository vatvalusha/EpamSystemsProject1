package cargo;

/**
 * Created by vatva on 14.02.2017.
 */
public class Cargo {
    private int weight;


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static Cargo createCargo() {
        return new CargoBuilder().build();
    }

    @Override
    public String toString() {
        return "Cargo: " +
                "weight = " + weight +
                " Kg";
    }
}

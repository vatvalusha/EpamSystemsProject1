package cargo;

/**
 * Created by vatva on 15.02.2017.
 */
public class CargoBuilder {
    int weight;

    CargoBuilder buildWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int generateWeight() {
        weight = (int) (20 + Math.random() * 50);
        return weight;
    }

    public Cargo build() {
        Cargo cargo = new Cargo();
        cargo.setWeight(generateWeight());
        return cargo;
    }
}

package carriage;

/**
 * Created by vatva on 14.02.2017.
 */
public enum Convenience {
    COUPE(2), LUXURY(1), RESERVED_SEAT(3),BAG(4);

    int prior;

    Convenience(int i) {
        this.prior = i;
    }

    public int getPrior() {
        return prior;
    }
}

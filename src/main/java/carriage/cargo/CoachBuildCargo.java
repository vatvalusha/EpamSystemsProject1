package carriage.cargo;

/**
 * Created by vatva on 16.02.2017.
 */
abstract public class CoachBuildCargo {
    protected CargoCoach cargoCoach;

    public CargoCoach getCoachBuildCargo() {
        return cargoCoach;
    }

    public void createCargoCoach() {
        cargoCoach = new CargoCoach();
    }

    public abstract void buildCargo();
    public abstract void buildCapacity();
    public abstract void buildConvenience();
}

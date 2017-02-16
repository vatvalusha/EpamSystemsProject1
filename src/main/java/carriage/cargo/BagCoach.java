package carriage.cargo;

import carriage.Convenience;

/**
 * Created by vatva on 16.02.2017.
 */
public class BagCoach extends CoachBuildCargo{
    public void buildCargo() {
            cargoCoach.setCargo(cargoCoach.getCargos());
    }

    public void buildCapacity() {
        cargoCoach.setCapacity(50);
    }

    public void buildConvenience() {
        cargoCoach.setConvenience(Convenience.BAG);
    }
}

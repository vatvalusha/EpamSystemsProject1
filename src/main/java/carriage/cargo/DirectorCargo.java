package carriage.cargo;

/**
 * Created by vatva on 16.02.2017.
 */
public class DirectorCargo {
    private CoachBuildCargo coachBuilderCargo;

    public void setCoachBuilder(CoachBuildCargo coachBuilderCargo) {
        this.coachBuilderCargo = coachBuilderCargo;
    }

    public CargoCoach getCargoCoach() {
        return coachBuilderCargo.getCoachBuildCargo();
    }

    public CargoCoach buildCoach() {
        coachBuilderCargo.createCargoCoach();
        coachBuilderCargo.buildCapacity();
        coachBuilderCargo.buildConvenience();
        coachBuilderCargo.buildCargo();


        CargoCoach cargoCoachCoach = coachBuilderCargo.getCoachBuildCargo();
        cargoCoachCoach.addCargo();
        return cargoCoachCoach;
    }

}

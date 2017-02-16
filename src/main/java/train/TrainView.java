package train;

import carriage.RailwayСarriage;
import carriage.cargo.CargoCoach;
import carriage.passenger.PassengerCoach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vatva on 16.02.2017.
 */
public class TrainView {

    Scanner scanner = new Scanner(System.in);
    Train train = new Train();
    static PassengerCoach passengerCoach = new PassengerCoach();
    static CargoCoach cargoCoach = new CargoCoach();
//    static List<RailwayСarriage> listTrain = new ArrayList<RailwayСarriage>();

    public void view() {
        int switcher = 0;
        while (switcher != 8) {
            System.out.println("1. Create train.");
            System.out.println("2. Count people in the train.");
            System.out.println("3. Sort luxury in the train.");
            System.out.println("4. Find Train where [min, max] people.");
            System.out.println("5. Add the coach to the train.");
            System.out.println("6. Remove last coach on the train.");
            System.out.println("7. Show order coaches.");
            System.out.println("8. Show train.");
            System.out.println("9. Count cargo and total weight.");
            System.out.println("10. Exit \n");
            System.out.print("     Choose number: ");
            switch (switcher = scanner.nextInt()) {
                case 1:
                    System.out.println("Input max count coach: ");
                    int countCoach = scanner.nextInt();
                    for (int i = 0; i < countCoach; i++) {
                        train.getCoaches().add(Train.createCoach(passengerCoach));
                    }
                    for(int i =0; i<2;i++) {
                        train.getCargoCoaches().add(Train.createBagCoach(cargoCoach));
                    }
                    break;
                case 2:
                    System.out.println(train.countPeopleInTrain());
                    break;
                case 3:
                    train.sortCoachLuxury(train.getCoaches());
                    break;
                case 4:
                    System.out.println("Input MIN count people:");
                    int min = scanner.nextInt();
                    System.out.println("Input MAX count people:");
                    int max = scanner.nextInt();
                    train.showOrderLuxury(train.findCoach(min, max));
                    break;
                case 5:
                    train.addCoach(Train.createCoach(passengerCoach));
                    break;
                case 6:
                    train.removeCoach();
                    break;
                case 7:
                    train.showOrderLuxury(train.getCoaches());
                    break;
                case 8:
                    System.out.println(train.getCoaches());
                    break;
                case 9:
                    System.out.println("Total weight: " + train.countTotalWeight() + " count bag: "+ train.countBag());
                    break;
                case 10:
                    switcher = 10;
                    System.out.println("Bay");
                    break;
            }
        }
    }
}

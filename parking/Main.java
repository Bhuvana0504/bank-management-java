package parking;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot(1);
        while(true){
            System.out.println("Parking Management System");
            System.out.println("Enter an Option");
            System.out.println("1.)Park Cars");
            System.out.println("2.)Display Cars");
            System.out.println("3.)Remove a Car");
            System.out.println("4.)Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter the Licence Number");
                    String lic = sc .nextLine();
                    System.out.println("Enter the Colour of the Car");
                    String col = sc.nextLine();
                    Car c = new Car(lic, col);
                    parkingLot.park(c);
                    break;
                case 2:
                    parkingLot.Display();
                    break;
                case 3:
                    System.out.println("Enter the Licence of the Car to be Removed");
                    String rem = sc.nextLine();
                    parkingLot.Remove(rem);
                    break;
                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    break;
            }
        }
    }
}
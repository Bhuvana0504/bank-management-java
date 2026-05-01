package parking;
import java.util.*;
class ParkingLot{
    private int cap;
    private Map<String,Car> mp = new HashMap<>();
    ParkingLot(int cap){
        this.cap=cap;
        this.mp= new HashMap<>();
    }
    void park(Car c){
        if(mp.size()<cap){
            mp.put(c.getLic(),c);
            System.out.println("Car Parked: "+c.getLic());
        }
        else{
            System.out.println("Parking Lot is full!!!");
        }
    }
    void Display(){
        if(mp.isEmpty()){
            System.out.println("Nothing to Show");
        }
        else{
            for(Car c:mp.values()){
                System.out.println("Car License: "+c.getLic()+" Car Colour: "+c.getCol());
            }
        }
    }
    void Remove(String rem){
        if(mp.containsKey(rem)){
            mp.remove(rem);
            System.out.println("Car Removed: "+rem);
        }
        else{
            System.out.println("The Car is not Parked in the Parking Lot");
        }
    }
}
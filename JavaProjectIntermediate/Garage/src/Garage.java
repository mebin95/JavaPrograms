
import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> listOfVehicles;

    public Garage(ArrayList<Vehicle> listOfVehicles) {
        this.listOfVehicles = listOfVehicles;
    }

    public ArrayList<Vehicle> getListOfVehicles() {
        return listOfVehicles;
    }

    public void addVehicle(Vehicle v) {
        this.listOfVehicles.add(v);
    }

    public void removeVehicle(int id) {
        ArrayList<Vehicle> v1 = new ArrayList<Vehicle>();
        for(Vehicle v : listOfVehicles) {
           if(v.getId() == id){
               v1.add(v);
           }
        }
        listOfVehicles.removeAll(v1);
    }

    public void removeVehicle(String vehicleType) {
        ArrayList<Vehicle> v1 = new ArrayList<Vehicle>();
        for(Vehicle v : listOfVehicles) {
            if(v.getVehicleType().equals(vehicleType)){
                v1.add(v);
            }
        }
        listOfVehicles.removeAll(v1);
    }

    public void emptyGarage() {
        this.listOfVehicles.removeAll(listOfVehicles);
    }



}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car benz = new Car(4,1, "Car", 5,"Benz", "A Class", 35000, 5);
        Car bmw = new Car(4,2, "Car", 4,"BMW", "3 Series", 33000, 4);
        Bike ariel = new Bike(2,3, "Bike", 2,"Ariel", "Ace R", 15000, false);
        Truck chev = new Truck(6,4, "Truck", 3,"Chevrolet", "LSSV", 63500, true);


        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        Garage g = new Garage(vehicles);

        //add vehicles to the garage
        g.addVehicle(benz);
        g.addVehicle(bmw);
        g.addVehicle(ariel);
        g.addVehicle(chev);


        //remove vehicle by vehicle type & id
        g.removeVehicle("Car");
        g.removeVehicle(2);


        //removes all vehicles from the garage
        g.emptyGarage();

        //calculate cost of fixing vehicles
        ariel.costOfFix();
        benz.costOfFix();
        bmw.costOfFix();
        chev.costOfFix();











    }
}

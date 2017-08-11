public class Car extends Vehicle {

    private int doors;

    public Car(int wheels, int id, String vehicleType, int seats, String make, String model, int value, int doors) {
        super(wheels, id, vehicleType, seats, make, model, value);
        this.doors = doors;
    }

    public void costOfFix() {
        System.out.println("Total Cost To Fix: " + getMake() + " - " + getModel() + ": £" + (50 + (10 * getDoors()) + getValue() * 0.05));
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}

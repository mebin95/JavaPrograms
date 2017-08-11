public class Bike extends Vehicle {

    private boolean sideCar;

    public Bike(int wheels, int id, String vehicleType, int seats, String make, String model, int value, boolean sideCar) {
        super(wheels, id, vehicleType, seats, make, model, value);
        this.sideCar = sideCar;
    }

    public void costOfFix() {
        int extra = 0;
        if (sideCar) {
            extra = 25;
        }
        System.out.println("Total Cost To Fix: " + getMake() + " - " + getModel() + ": £" + (50 + extra + getValue() * 0.05));

    }

    public boolean isSideCar() {
        return sideCar;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }
}

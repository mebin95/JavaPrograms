public class Truck extends Vehicle{

    private boolean trailers;

    public Truck(int wheels, int id, String vehicleType, int seats, String make, String model, int value, boolean trailers) {
        super(wheels, id, vehicleType, seats, make, model, value);
        this.trailers = trailers;
    }

    public void costOfFix() {
        int extra = 0;
        if(trailers){
            extra = 125;
        }
        System.out.println("Total Cost To Fix: " + getMake() + " - " + getModel() + ": £" + (50 + extra + getValue() * 0.03));

    }

    public boolean isTrailers() {
        return trailers;
    }

    public void setTrailers(boolean trailers) {
        this.trailers = trailers;
    }

}
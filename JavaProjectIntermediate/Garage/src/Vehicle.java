public abstract class Vehicle {

    private int wheels;
    private int id;
    private String vehicleType;
    private int seats;
    private String make;
    private String model;
    private int value;

    public Vehicle(int wheels, int id, String vehicleType, int seats, String make, String model, int value) {
        this.wheels = wheels;
        this.id = id;
        this.vehicleType = vehicleType;
        this.seats = seats;
        this.make = make;
        this.model = model;
        this.value = value;
    }


    public abstract void costOfFix();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}


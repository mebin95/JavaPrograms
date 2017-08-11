public class Paint {

    private String name;
    private double cost;
    private int coverage;
    private int quantity;

    public Paint(String name, double cost, int coverage, int quantity) {
        this.name = name;
        this.cost = cost;
        this.coverage = coverage * quantity;

    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    public double costPerLitre() {
        return getCost() / getCoverage();
    }

}
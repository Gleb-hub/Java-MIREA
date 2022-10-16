package tools.good;

public class Good {
    private String name;
    private double cost;

    public Good(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + ": " + cost + " rub";
    }

}

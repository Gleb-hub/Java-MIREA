import computer_brands.ComputerBrands;

public class Task4 {
    public static void main(String[] args) {
        Computer computer = new Computer("compModel", ComputerBrands.IBM,
                "procBrand", "procModel", 3.2,
                "memModel", "memBrand", 1000,
                "monModel", "monBrand", 27);

        System.out.println(computer);
    }
}

class Computer {
    private String model;
    private ComputerBrands brand;

    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(String model, ComputerBrands brand,
            String procBrand, String procModel, double procFreq,
            String memModel, String memBrand, double memSize,
            String monModel, String monBrand, double monDiagonal) {

        this.model = model;
        this.brand = brand;

        this.processor = new Processor(procBrand, procModel, procFreq);
        this.memory = new Memory(memModel, memBrand, memSize);
        this.monitor = new Monitor(monModel, monBrand, monDiagonal);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\n\tmodel: " + model +
                "\n\tbrand: " + brand +
                "\n\tprocessor: " + processor +
                "\n\tmemory: " + memory +
                "\n\tmonitor: " + monitor +
                "\n}";
    }

}

class Processor {

    private String model;
    private String brand;
    private double frequency;

    public Processor(String brand, String model, double frequency) {
        this.brand = brand;
        this.model = model;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "(model: " + model +
                " brand: " + brand +
                " frequency: " + frequency +
                ")";
    }
}

class Memory {
    private String model;
    private String brand;
    private double size;

    public Memory(String model, String brand, double size) {
        this.model = model;
        this.brand = brand;
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "(model: " + model +
                " brand: " + brand +
                " size: " + size +
                ")";
    }
}

class Monitor {
    private String model;
    private String brand;
    private double diagonal;

    public Monitor(String model, String brand, double diagonal) {
        this.model = model;
        this.brand = brand;
        this.diagonal = diagonal;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "(model: " + model +
                " brand: " + brand +
                " diagonal: " + diagonal +
                ")";
    }
}

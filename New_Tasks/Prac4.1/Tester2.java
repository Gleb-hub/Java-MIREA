
public class Tester2 {
    public static void main(String[] args) {

        Phone iphone = new Phone("+7905116252", "14 pro", 0.52);
        iphone.receiveCall("Igor");
        iphone.receiveCall("Gleb", "+78005553535");
        System.out.println(iphone.getNumber());
        iphone.sendMessage("1", "2", "3", "4");

    }
}

class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + ": " + number);
    }

    public void sendMessage(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

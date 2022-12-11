public class Task3 {
    private String code;
    private String city;
    private String threeNums;
    private String fourNums;

    public Task3(String phone) {
        if (phone.startsWith("8")) {
            code = "+7";
        } else {
            code = phone.substring(0, phone.length() - 10);
        }
        city = phone.substring(phone.length() - 10, phone.length() - 7);
        threeNums = phone.substring(phone.length() - 7, phone.length() - 4);
        fourNums = phone.substring(phone.length() - 4);
    }

    @Override
    public String toString() {
        return code + city + "-" + threeNums + "-" + fourNums;
    }

    public static void main(String[] args) {
        System.out.println(new Task3("+74992156565"));
        System.out.println(new Task3("84992156565"));
        System.out.println(new Task3("104992156565"));
        System.out.println(new Task3("124992156565"));
    }
}

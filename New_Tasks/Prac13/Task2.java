
public class Task2 {
    public static void main(String[] args) {
        Person person = new Person("Nechaev", "Gleb", "Maximovich");
        System.out.println(person);

        Person person2 = new Person("Nechaev", "Gleb");
        System.out.println(person2);
    }
}

class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String surname) {
        this.surname = surname;
        this.name = "";
        this.patronymic = "";
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
        this.patronymic = "";
    }

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        if (patronymic == "") {
            return surname + " " + name.charAt(0);
        }
        return surname + " " + name.charAt(0) + "." + patronymic.charAt(0);
    }

}

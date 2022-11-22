import java.text.SimpleDateFormat;
import java.util.*;
import java.text.SimpleDateFormat;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Gleb", new Date());

        System.out.println(student.toString("short"));
        System.out.println(student.toString("default"));
        System.out.println(student.toString("long"));

    }
}

class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String toString(String format) {
        SimpleDateFormat dateFormatter;
        if (format == "short") {
            dateFormatter = new SimpleDateFormat("M d, y");
        }
        else if (format == "long") {
            dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        }
        else {
            dateFormatter = new SimpleDateFormat("E, M d, y");
        }

        return "name: " + name + 
            "\nbirth: " + dateFormatter.format(birthDate);
    }

}

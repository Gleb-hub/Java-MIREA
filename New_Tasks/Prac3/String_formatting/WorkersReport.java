import java.util.*;

public class WorkersReport {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        int n = 10;

        Random rg = new Random();

        for (int i = 0; i < n; i++) {
            employees.add(new Employee("Name", rg.nextDouble() * 10000));
        }

        Report.generateReport(employees);
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(List<Employee> employees) {
        Formatter formatter = new Formatter();
        System.out.printf("%-3s\t%s\n", "Имя", "Зарплата");

        for (int i = 0; i < employees.size(); i++) {
            formatter.format("%s\t%8.2f\n", employees.get(i).getName(), employees.get(i).getSalary());
        }
        System.out.println(formatter);
    }
}

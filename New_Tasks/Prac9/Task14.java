import java.util.*;

public class Task14 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            students.add(new Student("Student" + i, i + 15, 15 - i, i + 30));
        }
        System.out.println(students);

        for (int left = 0; left < students.size(); left++) {
            Student value = students.get(left);

            int i = left - 1;

            for (; i >= 0; i--) {
                if (value.getiDNumber() < students.get(i).getiDNumber()) {
                    students.set(i + 1, students.get(i));
                } else {
                    break;
                }
            }
            students.set(i + 1, value);
        }
        System.out.println(students);

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.sort();

        // Collections.sort(students);
        // System.out.println(students);

        MergeSort ms = new MergeSort();
        ms.sort();
    }
}

class MergeSort {
    public ArrayList<Student> mergeSort(ArrayList<Student> ar) {
        if (ar.size() <= 1)
            return ar;

        ArrayList<Student> left, right;
        left = new ArrayList<Student>();
        right = new ArrayList<Student>();

        for (int i = 0; i < ar.size(); i++) {
            if (i % 2 != 0) {
                left.add(ar.get(i));
            } else {
                right.add(ar.get(i));

            }
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private ArrayList<Student> merge(ArrayList<Student> left, ArrayList<Student> right) {
        ArrayList<Student> ret = new ArrayList<Student>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0).getAge() <= right.get(0).getAge()) {
                ret.add(left.get(0));
                left.remove(0);
            } else {
                ret.add(right.get(0));
                right.remove(0);
            }
        }

        while (!left.isEmpty()) {
            ret.add(left.get(0));
            left.remove(0);
        }

        while (!right.isEmpty()) {
            ret.add(right.get(0));
            right.remove(0);
        }
        return ret;
    }

    public void sort() {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            students.add(new Student("Student" + i, i + 15, 15 - i, i + 30));
        }
        System.out.println(mergeSort(students));
    }
}

class Student implements Comparable<Student> {
    private int age;
    private String name;
    private int iDNumber;
    private int gpa;

    public Student(String name, int age, int iDNumber, int gpa) {
        this.name = name;
        this.age = age;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + ": {" +
                "age: " + age +
                ",id: " + iDNumber +
                ",gpa: " + gpa + "}";
    }

    @Override
    public int compareTo(Student p) {
        return name.compareTo(p.getName());
    }

}

class SortingStudentsByGPA {
    public void sort() {
        Comparator<Student> comparator = Comparator.comparing(obj -> obj.getGpa());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            students.add(new Student("Student" + i, i + 15, 15 - i, i + 30));
        }
        students.sort(comparator);
        System.out.println(students);

    }
}

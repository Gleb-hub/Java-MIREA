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
    public List<Student> mergeArray(List<Student> arrayA, List<Student> arrayB) {

        if (arrayA == null) {
            return null;
        }
        if (arrayA.size() < 2) {
            return arrayA;
        }

        List<Student> arrayC = new ArrayList<>(arrayA.size() + arrayB.size());
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.size(); i++) {
            if (positionA == arrayA.size()) {
                arrayC.set(i, arrayB.get(i - positionB));
                positionB++;
            } else if (positionB == arrayB.size()) {
                arrayC.set(i, arrayA.get(i - positionA));
                positionA++;
            } else if (arrayA.get(i - positionA).compareTo(arrayB.get(i - positionB)) < 0) {
                arrayC.set(i, arrayA.get(i - positionA));
                positionB++;
            } else {
                arrayC.set(i, arrayB.get(i - positionB));
                positionA++;
            }
        }
        return arrayC;
    }

    public List<Student> mergeSort(List<Student> arrayA) {

        List<Student> arrayB = arrayA.subList(0, arrayA.size() / 2);
        List<Student> arrayC = arrayA.subList(arrayA.size() / 2, arrayA.size());

        arrayB = mergeSort(arrayB);
        arrayC = mergeSort(arrayC);

        return mergeArray(arrayB, arrayC);
    }

    public void sort() {
        List<Student> students = new ArrayList<>();
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

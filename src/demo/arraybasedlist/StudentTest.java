package demo.arraybasedlist;

import java.util.*;

public class StudentTest {
    static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(123,"Tom",3.5),
                new Student(432,"Annie",3.7),
                new Student(543,"Bob",3.5),
                new Student(654,"Ram",3.8),
                new Student(789,"Bruce",3.6)
        ));
        System.out.println("Sos: ");
        for (Student student : students)
            System.out.println(student);
        System.out.println(students.size());
        System.out.println(students.add(new Student(555,"CC",2.9)));
        System.out.println(students.remove(new Student(123,"Tom",3.5)));
        System.out.println(students);
        System.out.println("Before sort:");
        students.forEach(a-> System.out.println(a));
        Collections.sort(students);
        System.out.println("After sort:");
        students.forEach(a-> System.out.println(a));

        Collections.sort(students, Comparator.comparing(Student::getName)
                .thenComparing(Student::getGpa).thenComparing(Student::getId));
        System.out.println("After Consist sorting:");
        students.forEach(a-> System.out.println(a));
    }
}

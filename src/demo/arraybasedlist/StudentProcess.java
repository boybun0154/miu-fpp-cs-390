package demo.arraybasedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StudentProcess {
    static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(123,"Tom",3.5),
                new Student(432,"Annie",3.7),
                new Student(543,"Bob",3.6),
                new Student(654,"Ram",3.0),
                new Student(789,"Bruce",2.4)
        ));
        // Filter
        // for loop
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getGpa()>3.5)
                System.out.println(s);
        }
        // foreach
        for (Student s : students) {
            if (s.getGpa()>3.5)
                System.out.println(s);
        }
        // lambda
        students.forEach(s->{
            if (s.getGpa()>3.5)
                System.out.println(s);
        });
        // iterator
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s =it.next();
            if (s.getGpa()>3.5)
                System.out.println(s);
        }
    }
}

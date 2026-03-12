package demo.binarysearchtree;

import demo.arraybasedlist.Student;

import java.security.Key;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeTest {
    static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Java");
        boolean b = set.add("C#");
        set.add("C++");
        set.add("Python");
        set.add("Angular");
        set.add("NodeJS");
        System.out.println(b);
        System.out.println(set);

        TreeSet<Student> ss = new TreeSet<>(
                Arrays.asList(new Student(123,"Tom",3.5),
                        new Student(432,"Annie",3.7),
                        new Student(543,"Bob",3.6),
                        new Student(544,"Bob",3.8),
                        new Student(654,"Sam",3.0),
                        new Student(789,"Bruce",2.4))
        );
        ss.forEach(System.out::println);

        TreeSet<Student> ss2 = new TreeSet<>((s1, s2) -> Integer.compare(s1.getId(),s2.getId()));
        TreeSet<Student>  ss3 = new TreeSet<>(Comparator.comparing(Student::getGpa));

        TreeMap<String,String> map = new TreeMap<>();
        map.put("Java","Tom");
        map.put("C#","Alice");
        map.put("Python","Bob");
        map.put("Angular","Charlie");
        map.put("NodeJS","Unnie");
        map.put("NodeJS","Unnie 2");
//        map.put(null,"Unnie");
        map.put("Test",null);
        System.out.println(map);
        System.out.println(map.get("Test"));
//        TreeMap<Key,String> map2 = new TreeMap<>();
    }
}

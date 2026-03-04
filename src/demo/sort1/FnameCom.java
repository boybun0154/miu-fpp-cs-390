package demo.sort1;

import java.util.Comparator;

//public class FnameCom implements Comparator {
//    @Override
//    public int compare(Object o1, Object o2) {
//        Person p1 = (Person)o1;
//        Person p2 = (Person)o2;
//        return p1.getFname().compareTo(p2.getFname());
//    }
//}

public class FnameCom implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFname().compareTo(o2.getFname());
    }
}
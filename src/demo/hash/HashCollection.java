package demo.hash;

import java.util.*;
import java.util.Map.Entry;

public class HashCollection {
    int ct=0;
    public static void main(String[] args) {
        HashCollection hc = new HashCollection();

        //Map<String,Course> table = new Hashtable<>();
        Hashtable<String, Course> table = new Hashtable<>();
        table.put("CS390", new Course("CS390", "FPP"));
        table.put("CS401", new Course("CS401", "MPP"));
        table.put("CS472", new Course("CS472", "Algorithms"));
        table.put("CS475", new Course("CS475", "Android"));
        table.put("CS572", new Course("CS572", "Advanced Algorithms"));

        System.out.println("1. Key set");
        Set<String> keys = table.keySet();
        for (String key : keys) {
            Course c = table.get(key);
            if (c.getCname().startsWith("A"))
                System.out.println(c);
        }

        System.out.println("2. Iterator Approach");
        Iterator<String> it = table.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            Course c = table.get(key);
            if (c.getCname().startsWith("A"))
                System.out.println(c);
        }

        System.out.println("3. Entry Set");
        Set<Entry<String, Course>> set = table.entrySet();
        for (Entry<String, Course> entry : set) {
            Course c = entry.getValue();
            if (c.getCname().startsWith("A"))
                System.out.println(c);
        }

        System.out.println("4. Values");
        Collection<Course> values = table.values();
        for (Course c : values) {
            if (c.getCname().startsWith("A"))
                System.out.println(c);
        }

        System.out.println("5. Lambda");
        table.forEach((k,v)->{
            if (v.getCname().startsWith("A"))
                System.out.println(v);
        });

        System.out.println("6. Enumeration");
        Enumeration<Course> enu = table.elements();
        while (enu.hasMoreElements()) {
            Course c = enu.nextElement();
            if (c.getCname().startsWith("A"))
                System.out.println(c);
        }

        System.out.println("Sorted by reverse order");
        List<Course> res = getCourseSorted(table);
        res.forEach(System.out::println);

        System.out.println("Sorted by Ids");
        List<Course> res2 = getCourseIds(table);
        res2.forEach(System.out::println);
    }

    public static List<Course> getCourseSorted(Hashtable<String, Course> table) {
        List<Course> list = new ArrayList<>();
        Set<String> keys = table.keySet();
        table.forEach((k,v)->list.add(v));
        list.sort(Comparator.comparing(Course::getCname).reversed());
        return list;
    }

    public static List<Course> getCourseIds(Hashtable<String, Course> table) {
        List<Course> list = new ArrayList<>();
        Set<String> keys = table.keySet();
        table.forEach((k,v)->list.add(v));
        list.sort(Comparator.comparing(Course::getCid).thenComparing(Course::getCname));
        return list;
    }
}

package demo.queue;

import demo.arraybasedlist.Student;
import demo.arraybasedlist.StudentComparator;

import java.util.*;

public class QueueAPIDemo {
    static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.remove());
        System.out.println(queue.poll());

        Queue<Student> sq = new PriorityQueue<>(Arrays.asList(
                new Student(123,"Tom",3.5),
                new Student(432,"Annie",3.7),
                new Student(543,"Bob",3.6),
                new Student(544,"Bob",3.8),
                new Student(654,"Ram",3.0),
                new Student(789,"Bruce",2.4)
        ));
        sq.forEach(System.out::println);

        Queue<String> q = new PriorityQueue<>();
        q.add("Apple");
        q.add("Lemon");
        q.add("Apricot");
        q.add("Banana");
        q.add("Orange");
        System.out.println(q);

        Iterator<String> it = q.iterator();
        while (it.hasNext()) {
            System.out.println(q.remove());
        }

        Queue<Student> q2 = new PriorityQueue<>(new StudentComparator());
        q2.addAll(Arrays.asList(new Student(123,"Tom",3.5),
                new Student(432,"Annie",3.7),
                new Student(543,"Bob",3.6),
                new Student(544,"Bob",3.8),
                new Student(654,"Ram",3.0),
                new Student(789,"Bruce",2.4)));
        q2.forEach(System.out::println);

        Deque<String> d = new LinkedList<>();
        d.addFirst("Apple");
        d.addFirst("Lemon");
        d.addLast("Apricot");
        System.out.println(d);

        Deque<String> q3 = new ArrayDeque<>();
        Queue<String> q4 = new ArrayDeque<>();
    }
}

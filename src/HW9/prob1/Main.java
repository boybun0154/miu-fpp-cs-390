package HW9.prob1;

public class Main {
    static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl(5);
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        queue.enqueue(10);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(60);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}

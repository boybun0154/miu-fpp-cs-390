package demo.linkedlist;

public class TestNode {
    static void main(String[] args) {
        MyLL ll = new MyLL();
        ll.addFirst1(20);
        ll.addFirst1(30);
        System.out.println(ll);
        System.out.println("Size: "+ll.size());
        System.out.println(ll.contains(30));
        ll.removeLast();
        System.out.println(ll);
    }
}

package HW9.prob2;

public class ArrayStack {
    /* Assumption: the stack will never become full */
    private static final int LEN = 500;
    private int top = -1;
    private int size = 0;

    private Integer[] arr = new Integer[LEN];
    private Node head;

    public ArrayStack() {
        head = new Node(null);
    }

    public void push(Integer x) {
        if(x == null) return;
        if (head.next == null)
            head.next = new Node(x);
        else {
            Node temp = head.next;
            head.next = new Node(x);
            head.next.next = temp;
        }
        size++;
    }

    public Integer peek() {
        //returns null if stack is empty
        if (size == 0) return null;
        else {
            return head.next.data;
        }
    }
    public Integer pop() {
        if (size == 0) return null;
        else {
            Node temp = head.next;
            head.next = temp.next;
            size--;
            return temp.data;
        }
    }
    public boolean isEmpty(){ // true if stack is empty
        return (size == 0);
    }

    public int size(){ // returns number of items in the stack
        return this.size;
    }

    @Override
    public String toString() {
        if(size == 0) return "<empty>";
        StringBuilder sb = new StringBuilder("[");
        Node temp = head.next;
        while(temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

    class Node {
        Integer data;
        Node next;
        public Node(Integer data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        ArrayStack st = new ArrayStack();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println("Size: {"+st.size()+"}");
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
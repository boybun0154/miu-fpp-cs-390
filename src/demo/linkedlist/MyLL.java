package demo.linkedlist;

import java.util.Objects;

public class MyLL {
    Node header;

    public MyLL() {
        header = new Node(null);
    }

    public void addFirst1(Integer data){
        Node nn = new Node(data);
        nn.prev = header;
        nn.next = header.next;
        if (header.next != null) //List is not empty
            header.next.prev = nn;
        header.next = nn;
    }
    // addFirst method
    public void addFirst2(Integer data){
        Node nn = new Node(header,data,header.next);
        if (header.next != null) //List is not empty
            header.next.prev = nn;
        header.next = nn;
    }
    public boolean removeLast(){
        if (header.next==null) return false;
        Node current = header;
        while (current.next!=null) {
            current=current.next;
        }
        current.prev.next=null;
        current=null;
        return true;
    }

    public boolean contains(Integer data){
        if (header.next==null) return false;
        for (Node current = header; current!=null ; current=current.next) {
            if (Objects.equals(current.data, data))
                return true;
        }
        return false; // Item not in the list
    }

    public int size(){
        if (header.next==null)
            return 0;
        int size=0;
        for (Node start = header; start.next != null; start=start.next) {
            ++size;
        }
        return size;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        if (header.next==null)
            return "[]";
        else {
            Node current = header.next;
            while (current!=null) {
                sb.append(current.data);
                sb.append("==>");
                current = current.next;
            }
            sb.append("Null]");
        }
        return sb.toString();
    }
    // Node Structure - Inner class

    class Node {
        Integer data;
        Node prev;
        Node next;

        Node(Integer data) {
            this.data = data;

        }
        Node(Node prev, Integer data, Node next){
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
}

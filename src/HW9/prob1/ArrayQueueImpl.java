package HW9.prob1;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;
    // Add Constructors, Default and Parameterized to initialize instance fields

    public ArrayQueueImpl() {
        arr = new Integer[DEFAULT_CAPACITY];
    }

    public ArrayQueueImpl(int capacity) {
        arr = new Integer[capacity];
    }

    public Integer peek() {
        if (!isEmpty() && arr[front]!=null) return arr[front];
        else return null;
    //implement
    }
    public void enqueue(int obj){
    //implement
        if (isEmpty()) {
            front = rear = 0;
            arr[rear] = obj;
            size++;
        } else {
            if (size == arr.length)
                resize();
            rear = (rear + 1) % arr.length;
            arr[rear] = obj;
            size++;
        }
    }
    public Integer dequeue() {
        if (peek() != null) {
            int obj = peek();
            arr[front] = null;
            front = (front + 1) % arr.length;
            size--;
            return obj;
        } else return null;
    }

    public boolean isEmpty(){
    //implement
        return this.size == 0;
    }

    public int size(){
    //implement
        return this.size;
    }

    private void resize(){
    //implement
        Integer[] newArr = new Integer[arr.length * 2];
        int index=0;
        while (front != rear) {
            newArr[index++] = arr[front];
            front = (front + 1) % arr.length;
        }
        newArr[index] = arr[rear];
        rear = index;
        front = 0;
        arr = newArr;
    }
    public String toString(){
    /* Return data in this format, each element separated by comma with in [ ] eg:
    [10, 20, 30, 40, 50, 60 ]*/
        if (isEmpty()) return "[]";
        else {
            StringBuilder sb = new StringBuilder("[");
            int i = front;
            while (i != rear) {
                sb.append(arr[i]);
                sb.append(", ");
                i=(i+1)%arr.length;
            }
            sb.append(arr[rear]).append("]");
            return sb.toString();
        }
    }
//    public String memory(){
//        StringBuilder sb = new StringBuilder("[");
//        for (Integer i : arr) {
//            sb.append(i).append(", ");
//        }
//        sb.append("]");
//        return sb.toString();
//    }
}

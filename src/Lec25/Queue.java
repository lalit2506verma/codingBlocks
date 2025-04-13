package Lec25;

public class Queue {
    protected int[] arr;
    protected int front = 0;
    private int size = 0;

    public Queue(){
        this(5);
    }

    public Queue(int n){
        this.arr = new int[n];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public int size(){
        return size;
    }

    public void Enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue Full");
        }
        int idx = (front + size) % arr.length;
        arr[idx] = item;
        size++;
    }

    public int Dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int v = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return v;
    }

    public int GetFront() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int v = arr[front];
        return v;
    }

    public void Display() {
        for (int i = 0; i < size; i++) {
            int idx = (front+1) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}

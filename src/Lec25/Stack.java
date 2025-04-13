package Lec25;

public class Stack {
    protected int[] arr;
    private int idx = -1;

    public Stack() {
        // this.arr = new int[5];
        this(5);  // call parameterized constructor internally
    }

    public Stack(int n) {
        this.arr = new int[n];
    }

    public boolean isEmpty() {
        return idx == -1;
    }

    public boolean isFull() {
        return idx == arr.length-1;
    }

    public void push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Size full");
        }
        idx++;
        arr[idx] = item;
    }

    public int size(){
        return idx+1;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return arr[idx];
    }

    public int pop() throws Exception {
        int res = peek();
        idx--;
        return res;
    }

    public void Display(){
        for (int i = 0; i < size(); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

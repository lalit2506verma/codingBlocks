package Lec30;

import java.util.LinkedList;

public class Stack_Using_Linked_list {
    private LinkedList<Integer> ll = new LinkedList<>();

    public void push(int item){
        ll.addFirst(item);
    }

    public int pop(){
        return ll.remove(); // remove first
    }

    public int peek(){
        return ll.get(0); // remove first
    }

    public static void main(String[] args) {
        Stack_Using_Linked_list sl = new Stack_Using_Linked_list();
        sl.push(10);
        sl.push(102);
        sl.push(101);
    }
}

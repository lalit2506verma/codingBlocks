package Lec29;

import org.w3c.dom.Node;

public class LinkedList {

    private class Node {
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item){
        Node node = new Node();
        node.val = item;
        if(size == 0){
            head = node;
            tail = node;
            size++;
        }
        else{
            node.next = head;
            head = node;
            size++;
        }
    }

    public void addLast(int item){
        if(size == 0){
            addFirst(item);
        }
        else{
            Node temp = new Node();
            temp.val = item;
            tail.next = temp;
            tail = temp;
            size++;
        }
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println(".");
    }

    private Node getNode(int idx) throws Exception {
        if(idx < 0 || idx <= size){
            throw new Exception("idx is not in range");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void addNodeAtIndex(int idx, int item) throws Exception {
        if(idx == 0){
            addFirst(idx);
        } else if (idx == size) {
            addLast(idx);
        }
        else {
            Node temp = new Node();
            temp.val = item;
            Node prev = getNode(idx - 1);
            temp.next = prev.next;
            prev.next = temp;
            size++;
        }
    }

    public int getFirst(){
        return head.val;
    }

    public int getLast(){
        return tail.val;
    }

    public int getAtIndex(int idx) throws Exception {
        return getNode(idx).val;
    }

    public int removeFirst(){
        Node curr = head;
        if(size == 1){
            head = null;
            tail = null;
            size = 0;
        }
        else{
            head = head.next;
            curr.next = null;
            size--;
        }
        return curr.val;
    }

    public int removeLast() throws Exception {
        if(size == 1){
            return removeFirst();
        }
        else{
            int val = tail.val;
            tail = getNode(size -2);
            tail.next = null;
            return val;
        }
    }

    public int removeAtIndex(int idx) throws Exception{
        if(idx == 0){
            return removeFirst();
        }
        else if(idx == size - 1){
            return removeLast();
        }
        else{
            Node prev = getNode(idx - 1);
            Node curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            size--;

            return curr.val;


        }
    }
}

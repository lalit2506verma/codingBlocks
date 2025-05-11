package Lec35;

public class Linkedlist<T> {
    private class Node {
        T val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(T item){
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

    public void addLast(T item){
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

    public void addNodeAtIndex(int idx, T item) throws Exception {
        if(idx == 0){
            addFirst(item);
        } else if (idx == size) {
            addLast(item);
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

    public T getFirst(){
        return head.val;
    }

    public T getLast(){
        return tail.val;
    }

    public T getAtIndex(int idx) throws Exception {
        return getNode(idx).val;
    }

    public T removeFirst(){
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

    public T removeLast() throws Exception {
        if(size == 1){
            return removeFirst();
        }
        else{
            T val = tail.val;
            tail = getNode(size -2);
            tail.next = null;
            return val;
        }
    }

    public T removeAtIndex(int idx) throws Exception{
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

    public static void main(String[] args) throws Exception {
        Linkedlist<String> ll = new Linkedlist<>();
        ll.addFirst("Raj");
        ll.addLast("Kamlesh");
        ll.addFirst("Kaju");
        ll.display();
    }
}

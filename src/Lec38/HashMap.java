package Lec38;

import java.util.ArrayList;

public class HashMap<K, V> {

    class Node{
        K key;
        V value;
        Node next;
    }

    private ArrayList<Node> bukt;
    private int size = 0;

    public HashMap(){
        this(4);
    }

    public HashMap(int n){
        bukt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bukt.add(null);
        }
    }

    public void put(K key,V value){
        int idx = hashFun(key);
        Node temp = bukt.get(idx);

        while(temp != null){
            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }

        temp = bukt.get(idx); // start
        Node nn = new Node();
        nn.key = key;
        nn.value = value;
        nn.next = temp;

        bukt.set(idx, nn);
        size++;

        double thf = 2.0; // threshold factor
        double lf = (1.0 * size) / bukt.size();  // load factor

        if(lf > thf){
            rehashing();
        }
    }

    private void rehashing() {
        ArrayList<Node> newBukt = new ArrayList<>();
        for (int i = 0; i < 2 * bukt.size(); i++) {
            newBukt.add(null);
        }

        ArrayList<Node> temp = bukt;
        size = 0;
        bukt = newBukt;

        for(Node head: temp){
            while(head != null){
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

    public V get(K key){
        int idx = hashFun(key);
        Node temp = bukt.get(idx);

        while(temp != null){
            if(temp.key.equals(key)){
                return temp.value;
            }

            temp = temp.next;
        }
        return null;
    }

    public boolean containKey(K key){
        int idx = hashFun(key);
        Node temp = bukt.get(idx);

        while(temp != null){
            if(temp.key.equals(key)){
                return true;
            }

            temp = temp.next;
        }
        return false;
    }

    private int hashFun(K key){
        int bt = key.hashCode() % bukt.size();
        if(bt < 0){
            bt += bukt.size();;
        }
        return bt;
    }

    public V remove(K key){
        int idx = hashFun(key);
        Node curr = bukt.get(idx);

        Node prev = null;

        while(curr != null){
            if(curr.key.equals(key)){
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        
        if(curr == null){
            return null;
        }

        if(prev == null){
            bukt.set(idx, curr.next);
            curr.next = null;
        }
        else{
            prev.next = curr.next;
        }

        curr.next = null;
        size--;
        return curr.value;
        
    }

    @Override
    public String toString() {
        String s = "{";
        for(Node head: bukt){
            while(head != null){
                s = s + head.key + " = " +head.value+", ";
                head = head.next;
            }
        }

        return s + '}';
    }
}

package Lec36;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> ll = new ArrayList<>();
    public void add(int item){
        ll.add(item);
        upheapify(ll.size() - 1);
    }

    private void upheapify(int i) {
        int parentIdx = (i - 1) / 2;

        if(ll.get(parentIdx) > ll.get(i)){
            swap( parentIdx, i);
            upheapify(parentIdx);
        }
    }

    private void swap(int parentIdx, int i) {
        int temp = ll.get(parentIdx);
        ll.set(parentIdx, ll.get(i));
        ll.set(i, temp);
    }

    public int size(){
        return ll.size();
    }

    public int get(){
        return ll.get(0);
    }

    public void display() {
        System.out.println(ll);
    }

    public int remove(){
        swap(0, ll.size()-1);
        int rv = ll.remove(ll.size() - 1);
        downHeapify(0);
        return rv;
    }

    private void downHeapify(int i) {
        int leftChildIdx = 2 * i + 1;
        int rightChildIdx = 2 * i + 2;

        int minIdx = i;

        if(leftChildIdx < ll.size() && ll.get(leftChildIdx) < ll.get(minIdx)){
            minIdx = leftChildIdx;
        }
        if(rightChildIdx < ll.size() && ll.get(rightChildIdx) < ll.get(minIdx)){
            minIdx = rightChildIdx;
        }
        if(minIdx != i){
            swap(minIdx, i);
            downHeapify(minIdx);
        }
    }
}

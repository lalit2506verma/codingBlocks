package Lec36;

public class HeapClient {
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(10);
        hp.add(20);
        hp.add(30);
        hp.add(5);
        hp.add(7);
        hp.add(2);
        hp.display();

        hp.remove();
        hp.display();
    }
}

package Lec25;

public class Queue_Client {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);
        queue.Display();

        queue.Dequeue();
        queue.size();
        queue.Dequeue();
        queue.Display();

    }
}

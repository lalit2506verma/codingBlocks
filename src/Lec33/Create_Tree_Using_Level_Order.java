package Lec33;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Using_Level_Order {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public Create_Tree_Using_Level_Order() {
        createTree();
    }

    public void createTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        root = nn;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            if(c1 != -1){
                Node n = new Node();
                n.val = c1;
                temp.left = n;
                q.add(n);
            }

            if(c2 != -1){
                Node n = new Node();
                n.val = c2;
                temp.right = n;
                q.add(n);
            }
        }
    }
}

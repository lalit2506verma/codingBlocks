package Lec31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.w3c.dom.Node;

public class Binary_Tree {
    static class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;
    private Scanner sc = new Scanner(System.in);

    public Binary_Tree(){
        root = createTree();
    }

    private Node createTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = createTree();
        }

        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = createTree();
        }

        return nn;
    }

    public void Display(){
        Display(root);
    }


    private void Display(Node root){
        if(root == null){
            return;
        }

        String str = "<--" + root.val + "-->";
        if(root.left != null){
            str = root.left.val + str;
        }
        else{
            str = "." + str;
        }

        if(root.right != null){
            str = str + root.right.val;
        }
        else{
            str = str + ".";
        }

        System.out.println(str);
        Display(root.left);
        Display(root.right);
    }

    public int max(){
        return max(root);
    }

    private int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int lmax = max(root.left);
        int rmax = max(root.right);

        return Math.max(root.val, Math.max(lmax, rmax));
    }

    public boolean find(int item){
        return find(root, item);
    }

    private boolean find(Node root, int item){
        if(root == null){
            return false;
        }

        if(root.val == item){
            return true;
        }
        boolean left = find(root.left, item);
        boolean right = find(root.right, item);

        return left || right;
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root == null){
            return -1;  // -1 if we want sigle height is take as 0
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh)+1;
    }

    private void PreOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);

    }

    private void PostOrder(Node node){
        if(node == null){
            return;
        }

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.val + " ");

    }

    private void InOrder(Node node){
        if(node == null){
            return;
        }

        InOrder(node.left);
        System.out.println(node.val + " ");
        InOrder(node.right);

    }

    public void levelOrder(){
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            Node rv = que.poll();
            System.out.println(rv.val + " ");
            if(rv.left != null){
                que.add(rv.left);
            }
            if(rv.right != null){
                que.add(rv.right);
            }
        }

        System.out.println();
    }
}

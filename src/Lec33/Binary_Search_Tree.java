package Lec33;

public class Binary_Search_Tree {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    public Binary_Search_Tree() {
    }

    public Binary_Search_Tree(int[] arr){
        root = createTree(arr, 0, arr.length - 1);
    }

    private Node createTree(int[] in, int lo, int hi) {

        if(lo > hi){
            return null;
        }
        int mid = (lo + hi) / 2;
        Node nn = new Node();
        nn.val = in[mid];
        nn.left = createTree(in, lo, mid - 1);
        nn.right = createTree(in, mid+1, hi);

        return nn;
    }
}

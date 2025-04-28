package Lec32;

public class Diameter_of_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        class DiaPair{
            int dt = 0;
            int ht = -1;
        }
        public int diameterOfBinaryTree(TreeNode root) {
            if(root == null){
                return 0;
            }

            int ld = diameterOfBinaryTree(root.left);
            int rd = diameterOfBinaryTree(root.right);
            int sd = ht(root.left) + ht(root.right) + 2;
            return Math.max(sd, Math.max(ld, rd));
        }

        private int ht(TreeNode node){
            if(node == null){
                return -1;
            }

            int lh = ht(node.left);
            int rh = ht(node.right);

            return Math.max(lh, rh)+1;
        }

        public int diameterOfBinaryTree2(TreeNode root) {
            return diameter(root).dt;
        }

        public DiaPair diameter(TreeNode root){
            if(root == null){
                return new DiaPair();
            }

            DiaPair ldp = diameter(root.left);
            DiaPair rdp = diameter(root.right);
            int sd = ldp.ht + rdp.ht + 2;

            DiaPair sdp = new DiaPair();
            sdp.dt = Math.max(sd, Math.max(rdp.ht, ldp.ht));
            sdp.ht = Math.max(ldp.ht, rdp.ht)+1;

            return sdp;
        }
    }
}

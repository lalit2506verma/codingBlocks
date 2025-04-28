package Lec32;

public class Lowest_Common_Ancestor_of_a_Binary_Tree {
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

    class Solution{

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null){
                return null;
            }

            if(root == p || root == q){
                return root;
            }

            TreeNode left = lowestCommonAncestor(root.right, p, q);
            TreeNode right = lowestCommonAncestor(root.left, p, q);

            if(left != null && right != null){
                return root;
            }
            else if(left == null){
                return right;
            }
            else{
                return left;
            }
        }

    }
}

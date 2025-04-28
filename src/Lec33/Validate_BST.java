package Lec33;

public class Validate_BST {
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
        class BstPair{
            boolean isBST = true;
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
        }

        public boolean isValidBST(TreeNode root) {
            return validateBST(root).isBST;
        }

        public BstPair validateBST(TreeNode root){
            if(root == null){
                return new BstPair();
            }
            BstPair lbp = validateBST(root.left);
            BstPair rbp = validateBST(root.right);
            BstPair sbp = new BstPair();
            sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
            sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));

            sbp.isBST = lbp.isBST && rbp.isBST && root.val > lbp.max && rbp.min > root.val;
            return sbp;
        }
    }
}

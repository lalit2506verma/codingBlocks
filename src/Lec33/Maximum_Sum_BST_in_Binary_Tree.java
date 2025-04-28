package Lec33;

public class Maximum_Sum_BST_in_Binary_Tree {
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
        class BstPair{
            boolean isBST = true;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            int ans = 0;
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
            sbp.sum = lbp.sum + rbp.sum + root.val;
            sbp.isBST = lbp.isBST && rbp.isBST && root.val > lbp.max && rbp.min > root.val;

            if(sbp.isBST){
                sbp.ans = Math.max(sbp.sum, Math.max(lbp.ans, rbp.ans));
            }
            else{
                sbp.ans = Math.max(lbp.ans, rbp.ans);
            }
            return sbp;
        }

        public int maxSumBST(TreeNode root) {
            return validateBST(root).ans;
        }
    }
}

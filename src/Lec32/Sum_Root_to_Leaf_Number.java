package Lec32;

public class Sum_Root_to_Leaf_Number {
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
        public int sumNumbers(TreeNode root){
            return Numbers(root, 0);
        }

        public int Numbers(TreeNode root, int sum){
            if(root == null){
                return 0;
            }

            if(root.left == null && root.right == null){
                return sum * 10 + root.val;
            }
            int leftNumber = Numbers(root.left, sum * 10 + root.val);
            int rightNumber = Numbers(root.right, sum * 10 + root.val);

            return leftNumber + rightNumber;
        }
    }
}

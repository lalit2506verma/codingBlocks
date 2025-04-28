package Lec32;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {
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
        int max_depth = 0;

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ll = new ArrayList<>();
            rightview(root, 1, ll);
            return ll;
        }

        public void rightview(TreeNode root, int curr_lvl, List<Integer> ll){
            if(root == null){
                return;
            }

            if(max_depth < curr_lvl){
                max_depth = curr_lvl;
                ll.add(root.val);
            }

            rightview(root.right, curr_lvl + 1, ll);
            rightview(root.left, curr_lvl+1, ll);
        }
    }
}

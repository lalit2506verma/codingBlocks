package Lec34;

import Lec33.Delete_Node_in_a_BST;
import com.sun.source.tree.Tree;

public class Construct_Binary_Tree_from_reorder_and_Inorder_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return createTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
        }

        public TreeNode createTree(int[] preOrder, int plo, int phi, int[] inOrder, int ilo, int ihi){
            if(plo > phi || ilo > ihi){
                return null;
            }

            TreeNode node = new TreeNode(preOrder[plo]);
            int rootIdx = search(inOrder, node.val);
            int c = rootIdx - ilo;
            node.left = createTree(preOrder, plo+1 , plo+c, inOrder, ilo, rootIdx-1);
            node.right = createTree(preOrder, plo+ c+1, phi, inOrder, rootIdx+1, ihi);

            return node;
        }

        public int search(int[] arr, int target){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == target){
                    return i;
                }
            }
            return -1;
        }
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {

        if(checkHeight(root)==-1)
            return false;
        else
            return true;
        
    }

        private int checkHeight(TreeNode root) {
        if (root == null) return 0;
        
        // Your Leaf Node Condition: A single node is balanced and has height 1
        if (root.left == null && root.right == null) return 1;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1; 

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1; 

        // Check if the current node breaks the balance rule
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; 
        }

        // Your preferred height return style (+1 added to both sides)
        return Math.max(leftHeight + 1, rightHeight + 1);
    }
}

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
    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeafHelper(root, 0);
    }

    private int sumRootToLeafHelper(TreeNode root, int num) {
        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            // 2 is base.
            return (num * 2) + root.val;
        }

        return sumRootToLeafHelper(root.left, num*2 + root.val) + sumRootToLeafHelper(root.right, num*2 +root.val);
    }
}
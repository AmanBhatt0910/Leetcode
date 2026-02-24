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
        return sumRootToLeafHelper(root, "");
    }

    private int sumRootToLeafHelper(TreeNode root, String num) {
        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            // 2 is base.
            return Integer.parseInt(num + root.val, 2);
        }

        return sumRootToLeafHelper(root.left, num + root.val) + sumRootToLeafHelper(root.right, num+root.val);
    }
}
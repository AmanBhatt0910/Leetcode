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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        // Always be sorted for BST
        inOrderTraversal(root, inOrder);

        // Now we will build a BST
        TreeNode newRoot;
        newRoot = buildBST(inOrder, 0, inOrder.size()-1);

        return newRoot;
    }

    private static TreeNode buildBST(List<Integer> inOrder, int start, int end) {
        if(start > end) return null;
        int mid = (start + end) / 2;

        TreeNode newNode = new TreeNode(inOrder.get(mid));

        newNode.left = buildBST(inOrder, start, mid - 1);
        newNode.right = buildBST(inOrder, mid + 1, end);

        return newNode;
    }

    private static void inOrderTraversal(TreeNode root, List<Integer> inOrder) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left, inOrder);
        inOrder.add(root.val);
        inOrderTraversal(root.right, inOrder);
    }
}
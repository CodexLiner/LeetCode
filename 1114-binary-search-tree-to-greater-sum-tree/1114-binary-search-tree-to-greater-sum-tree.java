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
    int sum = Integer.MIN_VALUE;
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        bstToGst(root.right);
        if (sum==Integer.MIN_VALUE){
            sum = root.val;
        }else {
            sum = sum + root.val;
            root.val = sum;
        }
        // System.out.print(root.val + " ");
        bstToGst(root.left);

        return root;
    }
}
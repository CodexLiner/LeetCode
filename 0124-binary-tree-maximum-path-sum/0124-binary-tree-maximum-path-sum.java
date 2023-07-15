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
    public int maxPathSum(TreeNode root) {
        int [] arr = new int[1];
        arr[0] = Integer.MIN_VALUE;
        h(root , arr);
        return arr[0];
    }
    public int h(TreeNode root , int[] i) {
        if(root == null){
            return 0;
        }
        int l = Math.max(0 , h(root.left , i));
        int r = Math.max(0 , h(root.right , i));
        i[0] = Math.max(i[0] , root.val + l + r);
        return Math.max(l , r)+ root.val;
    }
}
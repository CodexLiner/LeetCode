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
    public static List<Integer> largestValues(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            List<TreeNode> childNodes = new ArrayList<>();
            while (!queue.isEmpty() && queue.peek() != null) {
                max = Math.max(max, queue.peek().val);
                if (queue.peek().left != null) {
                    childNodes.add(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    childNodes.add(queue.peek().right);
                }
                queue.poll();
            }
            if (!childNodes.isEmpty()){
                queue.addAll(childNodes);
            }
            ans.add(max);
        }
        return ans;
    }
}
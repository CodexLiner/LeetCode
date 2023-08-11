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
 public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder s = new StringBuilder();
        s.append(root.val);
        return binaryTreePaths(root, new ArrayList<>(), "");
    }

    public List<String> binaryTreePaths(TreeNode root, ArrayList<String> ans, String s) {
        if (root.left == null && root.right== null) {
            s+=(root.val);
            ans.add(s.toString());
            return ans;
        }
        if (root.left != null) {
            String s2 = s;
            binaryTreePaths(root.left, ans, s2+=root.val+"->");
            
        }
        if (root.right != null) {
            binaryTreePaths(root.right, ans, s+=root.val+"->");
        }

        return ans;

    }
}
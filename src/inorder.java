
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) {
      this.val = val;
  }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}
public class inorder {
    public static List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal(root , new ArrayList<>());
    }
    public static List<Integer> inorderTraversal(TreeNode root , ArrayList<Integer> list) {
        if (root == null){
            return new ArrayList<>();
        }
        inorderTraversal(root.left , list);
        list.add(root.val);
        inorderTraversal(root.right , list);
        return list;
    }

    public static void main(String[] args) {
        TreeNode x = new TreeNode(3);
        TreeNode y = new TreeNode(2 , x , null);
        TreeNode t = new TreeNode(1 , null , y);


        ArrayList<Integer> list = (ArrayList<Integer>) inorderTraversal(t);
        System.out.println(Arrays.toString(list.toArray()));
    }
}

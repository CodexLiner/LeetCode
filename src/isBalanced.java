public class isBalanced {
    public boolean isBalanced(TreeNode root) {
      if (root == null){
          return true;
      }
      int right = maxDepth(root.right);
      int left = maxDepth(root.left);
      if (right == left || right == left - 1) return true;
      if (left == right - 1) return true;
      return false;
    }
    public static int maxDepth(TreeNode root) {
        if (root == null ){
            return 1;
        }
        int x = 1; int y = 1;
        x+= maxDepth(root.left);
        y+= maxDepth(root.right);
        return Math.max(x , y);
    }
    public static void main(String[] args) {

    }
}

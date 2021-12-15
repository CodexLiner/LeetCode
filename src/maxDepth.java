public class maxDepth {
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
        TreeNode t = new TreeNode(1 , new TreeNode(1 , null , new TreeNode(1)) , null);
        System.out.println(maxDepth(t));
    }
}

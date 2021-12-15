public class pathSum {
                                        public static boolean hasPathSum(TreeNode root, int targetSum) {
                                            if (root == null) {
                                                return false;
                                            }
                                            if (root.left == null || root.right == null && targetSum - root.val == 0){
                                                return true;
                                            }
                                           return  hasPathSum(root.left , targetSum - root.val) || hasPathSum(root.right , targetSum - root.val);
                                        }
    public static int hasPathSumH(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
         int x = root.val;
         x += hasPathSumH(root.left , targetSum);
         if (x == targetSum){
             return x;
         }
         x+= hasPathSumH(root.right , targetSum);
         return x;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1 , new TreeNode(2) , new TreeNode(3));
        System.out.println(hasPathSum(treeNode , 3));

    }
}

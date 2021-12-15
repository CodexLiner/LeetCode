public class sameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null &&  q == null){
            return true;
        }
        if (p == null){
            return false;
        }
        if (q== null){
            return false;
        }
        if (p.val == q .val){
            isSameTree(p.left , q.left);
            isSameTree(p.right , q.right);
        }

        return false;
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1 , null  , new TreeNode(2));
        TreeNode r = new TreeNode(1 ,  new TreeNode(2) , null);
        System.out.println(isSameTree(t , r));
    }
}

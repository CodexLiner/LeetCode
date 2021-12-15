public class sortedArrayTobst {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums , 0 , 0);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int i, int j) {
        if (i > j){
            return null;
        }
        int mid = (i + j) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sortedArrayToBST(nums , i ,mid-1 );
        treeNode.right = sortedArrayToBST(nums , mid+1 , j  );
        return treeNode;
    }
}

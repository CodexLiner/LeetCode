public class remove_element {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                count++;
            }
        }
        return nums.length - count;
    }
}

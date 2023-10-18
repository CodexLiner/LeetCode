class Solution {
    public static int maximumDifference(int[] nums) {
        int small = Integer.MAX_VALUE;
        int max = -1;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] < small) {
                small = nums[i];
            } else if (nums[i] > small) {
               max =  Math.max(max, Math.abs(nums[i] - small));
            }
        }
        return max;
    }
}
class Solution {
    public static int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length + 1][nums.length + 1];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        return lengthOfLIS(nums, 0, -1, dp);
    }

    public static int lengthOfLIS(int[] nums, int index, int prev, int[][] dp) {
        if (index == nums.length) return 0;
        if (dp[index][prev + 1] != -1) return dp[index][prev+1];
        int take = lengthOfLIS(nums, index + 1, prev, dp);
        int notTake = 0;
        if (prev == -1 || nums[index] > nums[prev]) {
            notTake = lengthOfLIS(nums, index + 1, index, dp) + 1;
        }
        return dp[index][prev + 1] = Math.max(notTake, take);
    }
}
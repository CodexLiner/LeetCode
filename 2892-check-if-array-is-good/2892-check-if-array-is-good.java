class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int m = nums[nums.length - 1];
        return nums.length - 1 == m && nums[nums.length - 2] == m;
    }
}
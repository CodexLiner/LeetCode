class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int l = lower_bound(nums, target);
        int u = upper_bound(nums, target);
        if (l == nums.length || nums[l] != target) return new int[]{-1, -1};
        return new int[]{l, u - 1};
    }

    public static int upper_bound(int[] nums, int target) {
        int ans = nums.length;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }

    public static int lower_bound(int[] nums, int target) {
        int ans = nums.length;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }
}
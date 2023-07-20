class Solution {
    public int findMin(int[] nums) {
        return search(nums, Integer.MAX_VALUE);
    }
    public static int search(int[] nums, int target) {
        int ans = nums.length;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {

            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                target = nums[mid];
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }
            if (nums[start] <= nums[mid]) {
                target = Math.min(target, nums[start]);
            }
            if (nums[start] <= nums[mid]) {
//                end = mid - 1;
                start = mid + 1;

            } else {

                end = mid - 1;
                target = Math.min(target, nums[start]);


            }
        }
        return target;
    }
}
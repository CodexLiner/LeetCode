class Solution {
    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums[nums.length - 1] - nums[0];;
        while (start < end) {
            int mid = (start + end) / 2;
            if (check(nums, mid , p)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static boolean check(int[] nums, int mid, int p) {
        int i = 0;
        int count = 0;
        while (i < nums.length - 1 && count < p) {
            if (nums[i + 1] - nums[i] <= mid) {
                i += 2;
                count++;
            } else i++;
        }
        return count >= p;
    }

}
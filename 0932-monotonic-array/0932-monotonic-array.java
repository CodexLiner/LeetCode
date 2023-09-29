class Solution {
    public static boolean isMonotonic(int[] nums) {
        boolean isC = true;
        boolean isD = true;
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] > nums[j]) {
                isC = false;
            }
            i++;
            j++;
        }
        i = 0;
        j = 1;
        while (j < nums.length) {
            if (nums[i] < nums[j]) {
                isD = false;
            }
            i++;
            j++;
        }

        return isD || isC;
    }

}
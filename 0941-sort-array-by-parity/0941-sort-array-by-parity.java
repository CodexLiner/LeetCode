class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int oddCount = 0;
        for (int i : nums) {
            if (i % 2 != 0) oddCount++;
        }
        int[] odds = new int[oddCount];
        int[] evens = new int[nums.length - oddCount];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i : nums) {
            if (i % 2 != 0) odds[oddIndex++] = i;
            else evens[evenIndex++] = i;
        }
        // Arrays.sort(odds);
        int i = 0;
        for (; i < evens.length; i++) {
            nums[i] = evens[i];
        }
        for (int even : odds) {
            nums[i++] = even;
        }

        return nums;
    }

}
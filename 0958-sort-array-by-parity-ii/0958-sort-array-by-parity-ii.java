class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int posi = 0;
        int negi = 0;

        for (int num : nums) {
            if (num % 2!= 0) {
                neg[negi++] = num;
            } else pos[posi++] = num;
        }
        posi = 0;
        negi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = pos[posi++];
            } else {
                nums[i] = neg[negi++];
            }
        }
        // System.out.println(Arrays.toString(nums));
        return nums;   
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        list.sort(Collections.reverseOrder());
        if (list.size() >= 3)return list.get(2);
        Arrays.sort(nums);
        return nums[nums.length - 1];      
    }
}
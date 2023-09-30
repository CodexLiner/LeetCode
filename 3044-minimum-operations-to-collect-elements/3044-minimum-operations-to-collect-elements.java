class Solution {
    public static int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= k; i++) {
            set.add(i);
        }
        int count = 0;
        int i = nums.size() - 1;
        while (i >= 0 && !set.isEmpty()) {
            if (set.contains(nums.get(i))) {
                set.remove(nums.get(i));
            }
            count++;
            i--;
        }
        return count;
    }
}
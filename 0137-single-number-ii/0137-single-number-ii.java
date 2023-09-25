class Solution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (key.getValue() == 1) return key.getKey();
        }
        return -1;
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int [] arr = new int[2];
        int index = 0;
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (key.getValue() == 1 && index <=1) {
                arr[index++] = key.getKey();
            }
        }
        return arr;
    }
}
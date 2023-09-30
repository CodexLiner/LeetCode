class Solution {
    public static boolean find132pattern(int[] nums) {
        int secondMax = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int x = nums[i];
            if (x < secondMax) return true;
            while (!stack.isEmpty() && x > stack.peek()) {
                secondMax = Math.max(secondMax, stack.pop());
            }
            stack.add(x);
        }

        return false;
    }
}
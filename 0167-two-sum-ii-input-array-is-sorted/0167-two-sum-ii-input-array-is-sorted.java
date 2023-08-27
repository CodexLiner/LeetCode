class Solution {
    // public static int[] twoSum(int[] numbers, int target) {
    //     for (int i = 0; i < numbers.length; i++) {
    //         for (int j = i + 1; j < numbers.length; j++) {
    //             if (numbers[i] + numbers[j] == target) return new int[]{i + 1, j + 1};
    //         }
    //     }
    //     return new int[0];
    // }
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            }
        }
        return new int[0];
    }
}
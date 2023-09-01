class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        int pointer = 1;
        for (int i = 1; i <= n; i++) {
            int x = i;
            int count = 0;
            while (x > 0) {
                int rem = x % 2;
                if (rem == 1) count++;
                x = x / 2;
            }
            arr[pointer++] = count;
        }

        return arr;
    }
}
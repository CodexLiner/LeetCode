class Solution {
    static class pair {
        int freq;
        int index;

        public pair(int freq, int index) {
            this.freq = freq;
            this.index = index;
        }

        @Override
        public String toString() {
            return "pair{" +
                    "freq=" + freq +
                    ", index=" + index +
                    '}';
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        pair[] arr = new pair[mat.length];

        for (int i = 0; i < mat.length; i++) {
            int freq = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    freq++;
                }
            }
            arr[i] = new pair(freq, i);
            System.out.println();
        }
        Arrays.sort(arr, (a, b) -> a.freq - b.freq);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i].index;
        }
        return ans;
    }

}
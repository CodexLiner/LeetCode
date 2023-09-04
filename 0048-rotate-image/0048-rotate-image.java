class Solution {
    public void rotate(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = r; c < matrix.length; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix.length - 1;

            while (start <= end){
                int temp = matrix[i][end];
                matrix[i][end] = matrix[i][start];
                matrix[i][start] = temp;
                start++;
                end--;
            }
            
        }
//        int fc = 0; // fc: first column
//        int lc = matrix[0].length - 1; //lc : last column
//        while (fc < lc) {
//            //swap first column with last column
//            for (int r = 0; r < matrix.length; r++) {
//                int temp = matrix[r][fc];
//                matrix[r][fc] = matrix[r][lc];
//                matrix[r][lc] = temp;
//            }
//
//            fc++;
//            lc--;
//        }

    }
    //     public static void rotate(int[][] matrix) {
    //     int[][] ans = new int[matrix.length][matrix.length];

    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix.length; j++) {
    //             ans[j][matrix.length - 1 - i] = matrix[i][j];
    //         }
    //     }
    //     int j = 0;
    //     for (int[] an : ans) {
    //          matrix[j] = an;
    //          j++;
    //     }

    //     matrix = ans;

    // }
}
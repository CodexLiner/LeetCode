class Solution {
  public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowStart = 0;
        int rowEnd = matrix.length - 1;

        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        int x = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = x++;
            }
            rowStart++;
            // top to down
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = x++;
            }
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                matrix[rowEnd][i] = x++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                matrix[i][colStart] = x++;
            }
            colStart++;
        }
        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }
}
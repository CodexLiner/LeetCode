class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> list = new ArrayList<>();
       if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;
        int rowStart = 0 ;
        int rowEnd = matrix.length -1;

        int colStart = 0;
        int colEnd = matrix[0].length -1;

       while (rowStart <= rowEnd && colStart <= colEnd) {
            // top traverse
            for (int i = colStart; i <= colEnd; i++) {
                list.add(matrix[rowStart][i]);
                // System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;
            //top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                list.add(matrix[i][colEnd]);
                // System.out.print(matrix[i][colEnd] + " ");
            }

            colEnd--;
            // right to left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    list.add(matrix[rowEnd][i]);
                    // System.out.print(matrix[rowEnd][i] + " ");
                }
            }
            rowEnd--;
            if (colStart <= colEnd) {
//            bottom to up
                for (int i = rowEnd; i >= rowStart; i--) {
                    list.add(matrix[i][colStart]);
                    // System.out.print(matrix[i][colStart] + " ");
                }
            }

            colStart++;


        }
        return list;
    }
}
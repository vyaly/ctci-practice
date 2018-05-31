package arraystring;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
class _01_08_ZeroMatrix {
    int[][] zero(int[][] matrix) {
        boolean[] rowZero = new boolean[matrix.length];
        boolean[] colZero = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[0].length; j++) {
                if(rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}

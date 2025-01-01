import java.util.ArrayList;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int nRow = mat.length;
        int nCol = mat[0].length;

        // If the total number of elements doesn't match, return the original matrix
        if (nRow * nCol != r * c) {
            return mat;
        }

        // Create a single list to store elements from the original matrix
        ArrayList<Integer> singleArray = new ArrayList<>();

        // Fill singleArray with elements from mat
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                singleArray.add(mat[i][j]);
            }
        }

        // Reshape the matrix
        int[][] result = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = singleArray.get(index);
                index++;
            }
        }

        return result;
    }
}

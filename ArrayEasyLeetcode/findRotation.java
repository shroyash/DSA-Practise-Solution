class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (check(mat, target)) {
                return true;
            }
            mat = rotate(mat); // Rotate the matrix 90 degrees clockwise
        }
        return false;
    }

    // Check if two matrices are identical
    public boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Rotate the matrix 90 degrees clockwise
    public int[][] rotate(int[][] mat) {
        int[][] transpose = new int[mat[0].length][mat.length];
        
        // Transpose the matrix (swap rows and columns)
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                transpose[j][i] = mat[i][j];
            }
        }

        // Reverse each row of the transposed matrix to rotate 90 degrees
        for (int i = 0; i < transpose.length; i++) {
            reverseRow(transpose[i]);
        }

        return transpose;
    }

    // Helper function to reverse a row in-place
    private void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
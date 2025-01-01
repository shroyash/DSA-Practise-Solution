class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        // Initialize the m x n matrix to all 0's
        int[][] arr = new int[m][n];
        
        // Process each index in the indices array
        for (int[] index : indices) {
            int ri = index[0]; // row to increment
            int ci = index[1]; // column to increment
            
            // Increment the entire row `ri`
            for (int j = 0; j < n; j++) {
                arr[ri][j]++;
            }
            
            // Increment the entire column `ci`
            for (int i = 0; i < m; i++) {
                arr[i][ci]++;
            }
        }
        
        // Count how many cells in the matrix have odd values
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
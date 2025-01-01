class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int dir = 0; // 0: right, 1: down, 2: left, 3: up
        
        while (top <= bottom && left <= right) {
            if (dir == 0) { // Fill the top row, left to right
                for (int i = left; i <= right; i++) {
                    result[top][i] = num++;
                }
                top++; // Move the top boundary down
            } 
            else if (dir == 1) { // Fill the right column, top to bottom
                for (int i = top; i <= bottom; i++) {
                    result[i][right] = num++;
                }
                right--; // Move the right boundary left
            } 
            else if (dir == 2) { // Fill the bottom row, right to left
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = num++;
                }
                bottom--; // Move the bottom boundary up
            } 
            else if (dir == 3) { // Fill the left column, bottom to top
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = num++;
                }
                left++; // Move the left boundary right
            }

            // Update direction
            dir = (dir + 1) % 4;
        }
        
        return result;
    }
}
class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length - 1; 
        int cols = 0;
        int ans = 0;
        
        while (rows >= 0 && cols < grid[0].length) {
            if (grid[rows][cols] < 0) { 
                ans += (grid[0].length - cols);
                rows--; 
            } else {
                cols++;
            }
        }
        return ans;
    }
}
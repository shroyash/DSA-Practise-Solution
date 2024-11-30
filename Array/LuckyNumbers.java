import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            // Find the minimum number in the current row
            int minNum = matrix[i][0];
            int minIndex = 0;
            
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minNum) {
                    minNum = matrix[i][j];
                    minIndex = j;
                }
            }
            
            // Check if the found minNum is the maximum number in its column
            boolean isMaxInColumn = true;
            
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > minNum) {
                    isMaxInColumn = false;
                    break;
                }
            }
            
            // If the minNum is the maximum in its column, it's a lucky number
            if (isMaxInColumn) {
                arr.add(minNum);
            }
        }
        
        return arr;
    }
}
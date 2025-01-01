class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result; // Handle empty matrix

        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int direction = 0; // 0: left to right, 1: top to bottom, 2: right to left, 3: bottom to top

        while (top <= bottom && left <= right) {
            if (direction == 0) { // Move left to right
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++; // Move the top boundary down
            } else if (direction == 1) { // Move top to bottom
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--; // Move the right boundary left
            } else if (direction == 2) { // Move right to left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom boundary up
            } else if (direction == 3) { // Move bottom to top
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Move the left boundary right
            }

            // Move to the next direction (cycle between 0 to 3)
            direction = (direction + 1) % 4;
        }

        return result;
    }
}
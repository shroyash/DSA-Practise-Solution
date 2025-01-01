class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        // Directions: right (0, 1), down (1, 0), left (0, -1), up (-1, 0)
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;  // Start with moving to the right
        int steps = 0;  // Step size
        int[][] result = new int[rows * cols][2];  // Store the result positions
        int totalStep = rows * cols;  // Total number of steps needed
        int stepCount = 0;  // Counter for number of positions filled
        result[0] = new int[]{rStart, cStart};  // Add the starting position to result
        stepCount++;

        while (stepCount < totalStep) {
            // Increase steps only after moving horizontally (right or left)
            if (directionIndex == 0 || directionIndex == 2) steps++;
            
            // Move in the current direction for 'steps' times
            for (int i = 0; i < steps; i++) {
                rStart += direction[directionIndex][0];
                cStart += direction[directionIndex][1];
                
                // If the new position is within bounds, store it in the result
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    result[stepCount] = new int[]{rStart, cStart};
                    stepCount++;
                }
            }
            
            // Switch to the next direction
            directionIndex = (directionIndex + 1) % 4;
        }

        return result;  // Return the filled result array
    }
}
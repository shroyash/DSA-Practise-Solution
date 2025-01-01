class Solution {
    public int findNumbers(int[] nums) {
        int count = 0; // This will count the numbers with even digits
        int i = 0;     // Index variable for iterating through the array

        while (i < nums.length) {
            int num = nums[i]; // Get the current number
            int digitCount = 0; // Initialize digit count

            // Edge case for zero
            if (num == 0) {
                digitCount = 1; // Zero has one digit
            } else {
                // Count the digits in the current number
                while (num > 0) {
                    num /= 10;     // Remove the last digit
                    digitCount++;  // Increment the digit count
                }
            }

            // Check if the digit count is even
            if (digitCount % 2 == 0) {
                count++; // Increment count if even
            }

            i++; // Move to the next number
        }

        return count; // Return the total count
    }

  
}
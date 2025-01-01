class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit and work backwards
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, just add one and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If we finished the loop, it means we had an overflow (e.g., 999 + 1)
        // We need a new array of size digits.length + 1
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; // Set the first digit to 1 (e.g., 1000)
        return newNumber; // Return the new number
    }
}
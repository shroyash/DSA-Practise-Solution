class Solution {
    public boolean isPerfectSquare(int num) {
        // Handle edge cases for 0 and 1
        if (num == 0 || num == 1) {
            return true; // Both 0 and 1 are perfect squares
        }
        
        // Set the search boundaries
        int start = 1;
        int end = num; // We can search up to num itself
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid; // Use long to prevent overflow
            
            if (square == num) {
                return true; // Found the perfect square
            } else if (square > num) {
                end = mid - 1; // Search the left half
            } else {
                start = mid + 1; // Search the right half
            }
        }
        
        return false; // No perfect square found
    }
}
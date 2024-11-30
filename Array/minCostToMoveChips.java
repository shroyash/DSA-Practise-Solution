class Solution {
    public int minCostToMoveChips(int[] position) {
        // Initialize counters for chips at even and odd positions
        int even = 0;
        int odd = 0;

        // Iterate through the positions array
        for (int i = 0; i < position.length; i++) {
            // If the chip's position is even, increment the even counter
            if (position[i] % 2 == 0) {
                even++;
            } else { // Otherwise, increment the odd counter
                odd++;
            }
        }

        // The minimum cost to move all chips to one position will be the smaller of:
        // 1. Moving all chips from odd positions to even positions
        // 2. Moving all chips from even positions to odd positions
        return Math.min(odd, even);
    }
}

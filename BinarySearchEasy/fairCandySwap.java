import java.util.Arrays;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // Calculate the total sums of Alice's and Bob's candies
        int sumA = 0;
        for (int num : aliceSizes) {
            sumA += num;
        }

        int sumB = 0;
        for (int num : bobSizes) {
            sumB += num;
        }

        // Calculate the difference delta
        int delta = (sumA - sumB) / 2;

        // Sort both arrays
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        // Initialize pointers
        int i = 0, j = 0;

        // Use two pointers to find the pair
        while (i < aliceSizes.length && j < bobSizes.length) {
            int diff = aliceSizes[i] - bobSizes[j];
            if (diff == delta) {
                return new int[] {aliceSizes[i], bobSizes[j]};
            } else if (diff < delta) {
                i++; // Move Alice's pointer forward
            } else {
                j++; // Move Bob's pointer forward
            }
        }

        return new int[0]; // Shouldn't reach here as solution is guaranteed
    }
}
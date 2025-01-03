class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;

        // Binary search to find the integer square root
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check mid*mid <= x using division to avoid overflow
            if (mid <= x / mid) {
                ans = mid;           // Store mid as the best current answer
                start = mid + 1;     // Move start to search in the higher half
            } else {
                end = mid - 1;       // Move end to search in the lower half
            }
        }

        return ans;
    }
}

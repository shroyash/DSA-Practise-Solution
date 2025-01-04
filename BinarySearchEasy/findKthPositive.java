class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Calculate how many numbers are missing up to arr[mid]
            if (arr[mid] - (mid + 1) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        // At this point, `high` is the last position where the number of missing elements is less than k
        // So we need to calculate the k-th missing number starting after arr[high]
        return k + high + 1;
    }
}

class Solution {
    public boolean checkIfExist(int[] arr) {
        // Sort the array to enable binary search
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            // Perform binary search for 2 * arr[i] in the sorted array
            if (binarySearch(arr, target, i)) {
                return true;
            }
        }
        return false;
    }

    // Helper method for binary search that excludes the current index `excludeIndex`
    private boolean binarySearch(int[] arr, int target, int excludeIndex) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if we found the target and it's not at the excluded index
            if (arr[mid] == target && mid != excludeIndex) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false; // Target not found
    }
}
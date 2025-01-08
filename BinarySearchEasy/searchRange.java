class Solution {
    public int[] git(int[] nums, int target) {
        int[] result = {-1, -1};  // Initialize result to [-1, -1] if target is not found

        // Binary search to find the first occurrence
        result[0] = findFirstOccurrence(nums, target);
        
        // Binary search to find the last occurrence
        result[1] = findLastOccurrence(nums, target);

        return result;
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                index = mid;  // Record the index
                high = mid - 1;  // Continue searching on the left side
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return index;
    }

    private int findLastOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                index = mid;  // Record the index
                low = mid + 1;  // Continue searching on the right side
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return index;
    }
}
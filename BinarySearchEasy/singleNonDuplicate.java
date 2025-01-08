class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length - 2;

        // Handle cases where the single element is at the boundaries
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        // Binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            } else if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || 
                       (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1; 
    }
}
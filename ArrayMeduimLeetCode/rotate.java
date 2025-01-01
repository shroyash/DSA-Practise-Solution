class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length; // Get the length of the array
        k = k % n; // Handle cases where k is greater than n
        
        reverse(nums, 0, n - 1); // Step 1: Reverse the entire array
        reverse(nums, 0, k - 1); // Step 2: Reverse the first k elements
        reverse(nums, k, n - 1); // Step 3: Reverse the remaining elements
    }
    
    // Reverse the elements in the array from left to right
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left]; // Swap elements
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}

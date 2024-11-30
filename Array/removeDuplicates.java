class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;  // Handle empty array case
        
        int index = 0;  // Start with the first element
        for (int i = 1; i < nums.length; i++) {  // Iterate through the array starting from the second element
            if (nums[index] != nums[i]) {  // If the current element is different from the last unique element
                index++;  // Move to the next position
                nums[index] = nums[i];  // Update the unique element
            }
        }
        
        return index + 1;  // Return the length of the array with unique elements
    }
}

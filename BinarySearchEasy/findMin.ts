class Solution {
    public int findMin(int[] nums) {
        int start = 1;
        int end = nums.length-2;
        if(nums.length ==1){
            return nums[0];
        }
        if(nums[start -1] > nums[start]){
            return nums[start];
        }
        if(nums[start -1] < nums[nums.length-1]){
            return nums[start -1];
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }else if(nums[start]>nums[mid]){
                end = mid -1 ;
            }else{
                start = mid +1;
            }
        }
        return -1;
        
    }
}
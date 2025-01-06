class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(binarySearch(nums,i) == i){
                return i;
            }
        }
        return -1;
        
      
        
    }
    static int binarySearch(int [] arr, int target){
        int start =0;
        int end = arr.length-1;
        int count =0;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= target){
                start = mid +1;
                count = start;
            }else if(arr[mid] <= target){
                end = mid-1;
                count = end;
            }
        }
        return count;
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Array to store left multiplication.
        int [] left = new int [nums.length];
        //first index is set to 1 because there n is no element on left side
        left[0] = 1;
        // we are iterating the array from index 1
        for(int i=1; i<left.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }


        //Array to store right multiplication.
        int [] right = new int [nums.length];
        //last index;
        int n = nums.length-1;
        //first index is set to 1 because there n is no element on left side
        right[n] = 1 ;
        // we are iterating the array from index second last
        for(int i=n-1; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        //Result Array
        int [] results = new int [nums.length];
        for(int i=0; i<nums.length; i++){
            results[i] = left[i] * right[i];
        }
        return results;



        
    }
}
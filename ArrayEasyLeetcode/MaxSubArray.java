class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for(int i=0;i<nums.length;i++){

            int currentSum = 0;
            for(int j=i;j<nums.length;j++){
                currentSum += nums[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

            }
        }
        return maxSum;
        
    }
}
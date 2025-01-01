class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int indx = index[i];

            for(int j=i;j>indx;j--){
                target[j] = target[j-1];
            }

            target[indx] = num;
           
        }
        return target;
        
    }
}
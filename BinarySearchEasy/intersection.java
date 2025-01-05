class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List <Integer> result = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(j=0; j<num2.length;j++){
                if(nums[i] == nums[j]){
                    get.result(j) != nums[i];
                    result.add(nums[i]);
                }
            }
        }
         int [] ans = new int[result.size()];
            for(i=0;i<result.size();i++){
                ans[i] = get.result(i);
            }
            return ans;
    }
}
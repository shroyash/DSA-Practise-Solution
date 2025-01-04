class Solution {
    public int arrangeCoins(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid*(mid+1)/2<=n){
                ans = mid;
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return ans;

        
        
    }
}
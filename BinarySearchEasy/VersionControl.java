/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start =1;
        int end =n;
        int ans =0;
        while(start<=end){
            int mid = start + (end - start)/2;
            boolean result = isBadVersion(mid);
            if(result == false){
                start = mid + 1;
            }else if(result == true){
                ans = mid;
                end = mid -1;
            }

        }
        return ans;
        
    }
}
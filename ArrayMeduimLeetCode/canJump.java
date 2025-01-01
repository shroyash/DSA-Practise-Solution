class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (reachable < i) {
                return false; // If we can't reach the current index, return false
            }
            reachable = Math.max(reachable, i + nums[i]); // Update the farthest reachable index
        }
        return true;
    }
}

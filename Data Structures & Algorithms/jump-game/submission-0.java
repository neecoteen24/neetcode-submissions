class Solution {
    public boolean canJump(int[] nums) {
        int gMax = 0;
        int lMax = 0;

        int ans = nums.length - 1;
        for(int i=0;i<nums.length;i++) {

            if(i > gMax)
            return false;
            
            if(gMax == ans)
            return true;

            gMax = Math.max(i + nums[i], gMax);

        }

        return true;
    }
}

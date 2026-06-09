class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = -1;
        int low = 1;
        for(int i=0;i<piles.length;i++){
            high = Math.max(piles[i],high);
        }

        int ans = Integer.MAX_VALUE;

        while(high >= low){
            int mid = low + (high-low)/2;
            int sum = 0;
            for(int pile : piles){
                sum += (pile + mid-1)/mid;
            }
            if(sum <= h){
                ans = Math.min(ans, mid);
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;

    }
}

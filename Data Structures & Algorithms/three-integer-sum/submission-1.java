class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i > 0 && nums[i] == nums[i-1])continue;

            int f = nums[i];
            int h = n - 1;
            int l = i + 1; 
            int target = -1 * f;
            while(h > l){
                if(nums[h] + nums[l] == target){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(f);
                    ls.add(nums[h]);
                    ls.add(nums[l]);

                    ans.add(ls);
                    h--;
                    l++;
                    while(h>l && nums[l] == nums[l-1]) l++;
                    while(h>l && nums[h] == nums[h+1]) h--;
                }
                else if(nums[h] + nums[l] > target){
                    h--;
                }
                else{
                    l++;
                }
            }
        }

        

        return ans;
    }
}

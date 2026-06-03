class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> pans = new HashSet<>();
        for(int i=0;i<n-2;i++){
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

                    pans.add(ls);
                    h--;
                    l++;
                }
                else if(nums[h] + nums[l] > target){
                    h--;
                }
                else{
                    l++;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> l : pans){
            ans.add(l);
        }

        return ans;
    }
}

class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        backtracking(0,nums,target,new ArrayList<>());
        return res;
    }
    public void backtracking(int i,int[] nums,int target,List<Integer> ans){
        if(target == 0){
            res.add(new ArrayList(ans));
            return;
        }
        

        if(i == nums.length || target < 0){
            return;
        }
        ans.add(nums[i]);
        backtracking(i, nums, target - nums[i], ans);

        ans.remove(ans.size()-1);
        backtracking(i+1,nums, target, ans);
    }
}

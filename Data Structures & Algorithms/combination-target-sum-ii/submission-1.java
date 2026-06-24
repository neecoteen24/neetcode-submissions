class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(0,nums,target,new ArrayList<>());

        return res;
    }
    public void backtracking(int i,int[] nums, int target,List<Integer> ans){
        if(target == 0){
            res.add(new ArrayList<>(ans));
            return;
        }
        
        for(int start=i;start<nums.length;start++){

            if(start > i && nums[start] == nums[start-1]){
            continue;
            }

            if(nums[start] > target){
                break;
            }

            ans.add(nums[start]);
            backtracking(start+1,nums,target-nums[start],ans);
            ans.remove(ans.size()-1);
        }
        
    }
}

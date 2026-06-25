class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>());
        return res;
    }
    public void backtrack(int i,int[] nums,List<Integer> ans){
        if(i == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        backtrack(i+1,nums,ans);
        ans.remove(ans.size()-1);
        backtrack(i+1,nums,ans); 
    }
}

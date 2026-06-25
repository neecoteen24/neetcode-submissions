class Solution {
    List<List<Integer>> res;
    boolean[] flag;
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        res = new ArrayList<>();
        flag = new boolean[n];
        backtracking(nums,new ArrayList<>());
        return res;
    }
    public void backtracking(int[] nums,List<Integer> ans){
        if(ans.size() == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(flag[i])
            continue;

            ans.add(nums[i]);
            flag[i] = true;
            backtracking(nums,ans);
            ans.remove(ans.size()-1);
            flag[i]=false;
            
        }
    }   
}

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>());
        return res;
    }

    public void backtrack(int start,int[] nums,List<Integer> ls){
        res.add(new ArrayList<>(ls));
        
        for(int i = start;i< nums.length;i++){
            if(i>start && nums[i] == nums[i-1])
            continue;

            ls.add(nums[i]);
            backtrack(i+1,nums,ls);
            ls.remove(ls.size()-1);
        }
    }

     
}

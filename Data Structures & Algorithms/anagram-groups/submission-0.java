class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray(); Arrays.sort(arr);
            String s = new String(arr);
            if(mp.containsKey(s)){
                mp.get(s).add(str);
            }
            else{
                List<String> ls = new ArrayList<>();
                ls.add(str);
                mp.put(s,ls);
            }

        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : mp.entrySet()){
            List<String> ls = entry.getValue();
            ans.add(ls);
        }

        return ans;
        }
}

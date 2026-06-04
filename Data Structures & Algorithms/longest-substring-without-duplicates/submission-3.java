class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int j=0;
        int max = 0;
        int l = s.length();
        if(l<=1)
        return l;
        for(int i=0;i<l;i++){
            char ch = s.charAt(i);
            if(st.contains(ch)){
                while(j<=i && st.contains(ch)){
                    st.remove(s.charAt(j));
                    j++;
                }
            }
            max = Math.max(max,i-j+1);
            st.add(ch);
        }
        return max;
    }
}

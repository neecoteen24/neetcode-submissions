class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty() && temp[st.peek()] < temp[i]){
                int x = st.pop();
                ans[x] = i - x;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int i = st.pop();
            ans[i] = 0;
        }

        return ans;
    }
}

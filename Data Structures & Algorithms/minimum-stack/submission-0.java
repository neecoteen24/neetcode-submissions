class MinStack {
    Stack<Integer> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty())
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> stt = new Stack<>();
        int mini = Integer.MAX_VALUE;
        if(st.isEmpty())
        return -1;
        else{
            while(!st.isEmpty()){
                int num = st.pop();
                stt.push(num);
                mini = Math.min(mini,num);
            }
            while(!stt.isEmpty())
            {
                st.push(stt.pop());
            }
        }
        return mini;
    }
}

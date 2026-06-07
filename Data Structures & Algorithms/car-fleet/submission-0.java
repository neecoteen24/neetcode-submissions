class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0])); //pq that contains a[0] as postion and a[1] as speed, sorted as max heap wrt position
        for(int i=0;i<speed.length;i++){
            pq.offer(new int[]{position[i],speed[i]});
        }

        Stack<Double> st = new Stack<>();
        int fleet = 0;
        while(!pq.isEmpty()){
            int[] arr = pq.poll();
            int pos = arr[0];
            int vel = arr[1];

            double x = (double)(target - pos)/(double)vel;

            if(st.isEmpty() || x > st.peek()){
                fleet++;
                st.push(x);
            }

            else{
                continue;
            }
            
        }

        return fleet;
    }
}

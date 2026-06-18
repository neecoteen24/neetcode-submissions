class Solution {
    class Pair{
        int[] v;
        double dist;
        Pair(int[] v,double dist){
            this.v = v;
            this.dist = dist;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Double.compare(b.dist,a.dist));
        int n = points.length;
        
        for(int[] point : points){
            double sq = point[0]*point[0] + point[1]*point[1];
            pq.offer(new Pair(new int[]{point[0],point[1]},sq));

            if(pq.size()>k){
                pq.poll();
            }

        }
        
        
        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            Pair p = pq.poll();

            int[] point = new int[]{p.v[0],p.v[1]};

            ans[i][0] = point[0];
            ans[i][1] = point[1];
        }

        return ans;

    }
}

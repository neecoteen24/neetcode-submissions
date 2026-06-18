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
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Double.compare(a.dist,b.dist));
        int n = points.length;
        
        for(int[] point : points){
            double sq = point[0]*point[0] + point[1]*point[1];
            double dist = Math.sqrt(sq);
            pq.offer(new Pair(new int[]{point[0],point[1]},dist));

        }
        System.out.print(pq.peek().dist);
        
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

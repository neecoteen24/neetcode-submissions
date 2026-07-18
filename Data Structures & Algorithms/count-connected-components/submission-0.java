class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] vis = new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                dfs(i,adj,vis);
            }
        }

        return count;
        
    }
    public void dfs(int i,List<List<Integer>> adj,boolean[] vis){

        vis[i] = true;

        for(int neigh : adj.get(i)){
            if(!vis[neigh]){
                dfs(neigh,adj,vis);
            }
        }

    }
}

class Solution {
    public int[] findOrder(int numCourses, int[][] preReq) {
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        lst.add(new ArrayList<>());

        int[] indegree = new int[numCourses];
        List<Integer> ans = new ArrayList<>();
        for(int[] arr : preReq){
            lst.get(arr[1]).add(arr[0]);
            indegree[arr[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i] == 0){
                q.add(i);
                ans.add(i);
            }
        }

        while(!q.isEmpty()){
            int node = q.poll();
            for(int n : lst.get(node)){
                indegree[n]--;
                if(indegree[n]==0){
                    q.add(n);
                    ans.add(n);
                }
            }
        }

        if(ans.size() == numCourses){
            int[] res = new int[ans.size()];
            for(int i = 0; i < ans.size(); i++){
                res[i] = ans.get(i);
            }
            return res;
        }
        
        return new int[]{};

    }
}

class Solution {
    public boolean canFinish(int numCourses, int[][] pr) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            ls.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for(int[] pre : pr){
            ls.get(pre[0]).add(pre[1]);
            indegree[pre[1]]++;
        }

        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            for(int el : ls.get(node)){
               indegree[el]--;
               if(indegree[el] == 0){
                q.add(el);
               }
            }
        }
        for(int i : indegree){
            if(i != 0)
            return false;
        }

        return true;
    }
}

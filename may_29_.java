class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        int[] degree = new int[n];
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i=0;i<n;i++)graph[i] = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int[] pair:prerequisites){
            degree[pair[0]]++;
            graph[pair[1]].add(pair[0]);
        }
        for (int i=0;i<n;i++){
            if (degree[i] == 0) q.add(i);
        }
        int count = 0;
        while (q.size()>0){
            int node = q.poll();
            count++;
            for (int child : graph[node]) if (--degree[child] == 0) q.add(child);
        }
        return count == n;
    }
}

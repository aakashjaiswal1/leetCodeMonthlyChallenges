class Solution {
    static ArrayList<Integer>[] graph;
    static int[] color;
    static boolean rotten;
    public static boolean possibleBipartition(int N, int[][] dislikes) {
        graph = new ArrayList[N];
        rotten = false;
        for (int i=0;i<N;i++)graph[i] = new ArrayList<>();
        for (int[] pair : dislikes){
            graph[pair[0] - 1].add(pair[1] -1);
            graph[pair[1] - 1].add(pair[0] -1);
        }
        color = new int[N+1];

        Arrays.fill(color,-1);
        color[N] = 1;
        for (int i=0;i<N;i++){
            if (color[i] == -1){
                dfs(i,N);
            }
        }
        return !rotten;
    }
    static void dfs(int node , int parent){
        if (rotten)return;
        if (color[node] == -1){
            color[node] = color[parent] ^ 1;
        }
        if (color[node] == color[parent]){
            rotten = true;
            return;
        }
        for (int child : graph[node]){
            if (color[child] != -1 && color[child] == color[node]){
                rotten = true;
                return;
            }
        }
        for (int child : graph[node]){
            if (color[child] == -1){
                dfs(child,node);
            }
        }
    }

}

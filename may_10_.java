class Solution {
    public int findJudge(int N, int[][] trust) {
        if( trust==null || trust.length==0)return 1;
        HashMap<Integer,Boolean> entry = new HashMap<>();
        int voteCount = 0;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int[] arr:trust){
            if(!entry.containsKey(arr[0])){
                entry.put(arr[0],true);
                voteCount++;
            }
            int val = count.getOrDefault(arr[1],0);
            count.put(arr[1],val+1);
        }
        int ans = -1;
        for(int key : count.keySet()){
            if(count.get(key)== voteCount){
                if(ans != -1){
                    ans = -1;
                    break;
                }else{
                    ans = key;
                }
            }
        }
        return ans;
    }
}

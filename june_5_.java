   class Solution {
        Random rand;
        ArrayList<Integer> prefix;
        public Solution(int[] w) {
            rand = new Random();
            int sum=0;
            prefix = new ArrayList<>();
            for (int val:w){
                sum+=val;
                prefix.add(sum);
            }
        }

        public int pickIndex() {
            int pos = Collections.binarySearch(prefix,rand.nextInt(prefix.get(prefix.size()-1))+1);
            if (pos<0)pos = pos*-1-1;
            return pos;
        }
    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */

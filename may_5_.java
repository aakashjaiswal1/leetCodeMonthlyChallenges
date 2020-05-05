class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            int val = hm.getOrDefault(c,0);
            hm.put(c,val+1);
        }
        int i = -1;
         for(char c:s.toCharArray()){
             i++;
            int val = hm.get(c);
            if(val == 1) return i;
        }
        return -1;
    }
}

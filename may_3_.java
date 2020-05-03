class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(char c:magazine.toCharArray()){
            count[c-'a']++;
        }
        boolean rotten = false;
         for(char c:ransomNote.toCharArray()){
            count[c-'a']--;
             if(count[c-'a']<0){
                 rotten = true;
                 break;
             }
        }
        if(rotten)return false;
        return true;
        
    }
}

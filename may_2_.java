class Solution {

    public int numJewelsInStones(String J, String S) {

        HashMap<Character,Boolean> hm = new HashMap<>();

        for (char c:J.toCharArray()){

            hm.put(c,true);

        }

        int ans=0;

        for (char c:S.toCharArray()){

            if (hm.containsKey(c)){

                ans++;

            }

        }

        return ans;

    }

}

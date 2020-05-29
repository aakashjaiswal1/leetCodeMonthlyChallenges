class Solution {
        public String frequencySort(String s) {
            HashMap<Character,Integer> count = new HashMap<>();
            for (char c : s.toCharArray()) {
                int val = count.getOrDefault(c,0);
                count.put(c,val+1);
            }
            ArrayList<pair> al = new ArrayList<>();
            for (char kk : count.keySet()){
                al.add(new pair(kk,count.get(kk)));
            }
            Collections.sort(al);
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<al.size();i++){
                pair pp = al.get(i);
                for (int j=0;j<pp.count;j++){
                    sb.append(pp.c);
                }
            }
            return sb.toString();

        }
                static class pair implements Comparable<pair>{
                char c;
                int count;

                public pair(char ch, int val) {
                    c= ch;
                    count = val;
                }

                @Override
                public int compareTo(pair o) {
                    return Integer.compare(o.count,this.count);
                }
            }
}

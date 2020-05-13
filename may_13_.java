class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length()<=k)return "0";
        int count = 0;
        Stack<Character> s = new Stack<>();
        for (char c:num.toCharArray()){
            while (s.size()>0 && count<k && s.peek()>c){
                count++;
                s.pop();
            }
            s.add(c);
        }
        while (s.size()>0 && count< k){
            count++;
            s.pop();
        }
        if (s.size()==0)s.add('0');
        StringBuilder sb = new StringBuilder();
        while(s.size()>0){
            sb.append(s.pop());
        }
        sb=sb.reverse();
        int zeros = 0;
        for (char c:sb.toString().toCharArray()){
            if (c!='0')break;
            zeros++;
        }
        if (sb.length()==zeros)return "0";
        return sb.toString().substring(zeros);
    }
}

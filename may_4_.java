class Solution {
    public int findComplement(int num) {
        int x = 1;
        while(num > x){
            x = x*2 +1;
        }
        return num ^ x;
    }
}

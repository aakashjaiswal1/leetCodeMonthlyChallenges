class Solution {
       public boolean checkStraightLine(int[][] coordinates) {
        int index = 0;
        int base_x= -1;
        int base_y = -1;
        int slopeY = -1;
        int slopeX= -1;
        for (int[] pair:coordinates){
            if(index==0){
                base_x = pair[0];
                base_y= pair[1];
                index++;
                continue;
            }
            int x = pair[0];
            int y = pair[1];
            int dy = y - base_y;
            int dx = x - base_x;
            int gcd = gcd(dy,dx);
            if (gcd!=0){
                dy/=gcd;
                dx/=gcd;
            }
            if (dx<0){
                dx*=-1;
                dy*=-1;
            }
            if (index==1){
                slopeY = dy;
                slopeX = dx;
            }else {
                if (slopeX != dx && slopeY != dy){
                    return false;
                }
            }
            index++;
        }
        return true;
    }
   static int gcd(int a ,int b){
       if(a == 0) return b;
       return gcd(b%a,a);
   }
}

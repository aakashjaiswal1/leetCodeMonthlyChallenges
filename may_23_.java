class Solution {
        public int[][] intervalIntersection(int[][] A, int[][] B) {
            int i=0 , j=0;
            List<int[]> al = new ArrayList<>();
            while (i<A.length && j < B.length){
                int start = Math.max(A[i][0],B[j][0]);
                int end   = Math.min(A[i][1],B[j][1]);
                if (start<=end) al.add(new int[]{start,end});
                if (A[i][1]<=B[j][1])i++;
                else                 j++;
            }
            return al.toArray(new int[0][]);
        }
}

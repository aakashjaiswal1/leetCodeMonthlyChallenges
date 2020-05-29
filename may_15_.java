class Solution {
    public static int maxSubarraySumCircular(int[] A) {
        int S = 0; 
        for (int x: A)
            S += x;
        int ans1 = kadane(A, 0, A.length-1, 1);
        if (A.length == 1)return ans1;
        int ans2 = S + kadane(A, 1, A.length-2, -1);
        return Math.max(ans1,ans2);
    }
    public static int kadane(int[] A, int i, int j, int sign) {
        int ans = Integer.MIN_VALUE;
        int cur = Integer.MIN_VALUE;
        for (int k = i; k <= j; ++k) {
            cur = sign * A[k] + Math.max(cur, 0);
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}

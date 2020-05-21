class Solution {
    public int countSquares(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans=0;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==0 || j ==0){
                    dp[i][j] = matrix[i][j];
                }else if(matrix[i][j] == 1){
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                }
                ans+=dp[i][j];
            }
        }
        return ans;
    }
}

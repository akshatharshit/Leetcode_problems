class Solution {
    int dp[][];
    public int sol(int[][] g,int i,int j){
        if(i>=g.length || j>=g[0].length)return Integer.MAX_VALUE;
        if(i==g.length-1 && j==g[0].length-1)return g[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=Math.min(sol(g,i+1,j),sol(g,i,j+1));
        return dp[i][j]=ans+g[i][j];
    }
    public int minPathSum(int[][] g) {
        int m=g.length;
        int n=g[0].length;
        dp=new int[m][n];
        for(int i[]: dp)Arrays.fill(i,-1);
        return sol(g,0,0);
    }
}
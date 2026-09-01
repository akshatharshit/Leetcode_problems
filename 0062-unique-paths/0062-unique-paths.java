class Solution {
    int dir[][]={{1,0},{0,1}};
    int dp[][];
    public int sol(int i,int j,int m,int n){
        if(i>=m || j>=n)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==m-1 && j==n-1)return 1;
        int v=0;
        for(int d[]: dir){
            int nx=d[0]+i;
            int ny=d[1]+j;
            if(nx>=0 && ny>=0 && nx<m && ny<n){
                 v+=sol(nx,ny,m,n);
            }
        }
        return dp[i][j]=v;
    }
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        for(int i[]:dp)Arrays.fill(i,-1);
        return sol(0,0,m,n);
    }
}
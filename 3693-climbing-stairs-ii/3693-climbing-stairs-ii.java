class Solution {
    int dp[];
    public int sol(int n,int[] c,int i){
        if(i==n)return 0;
        if(i>n)return (int)1e9;
        if(dp[i]!=-1)return dp[i];
        int one=(i+1<=n)?(c[i]+1+sol(n,c,i+1)):(int)1e9;
        int two=(i+2<=n)?(c[i+1]+4+sol(n,c,i+2)):(int)1e9;
        int three=(i+3<=n)?(c[i+2]+9+sol(n,c,i+3)):(int)1e9;
        return dp[i]=Math.min(one,Math.min(two,three));
    }
    public int climbStairs(int n, int[] costs) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return sol(n,costs,0);
    }
}
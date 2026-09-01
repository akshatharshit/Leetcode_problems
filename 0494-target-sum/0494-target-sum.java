class Solution {
    int dp[][];
    int off=0;
    public int sol(int a[],int t,int i, int s){
        if(i==a.length){
            return s==t?1:0;
        }
        int id=s+off;
        if(dp[i][id]!=-1)return dp[i][id];
        int add=sol(a,t,i+1,s+a[i]);
        int sub=sol(a,t,i+1,s-a[i]);
        return dp[i][id]=add+sub;
    }
    public int findTargetSumWays(int[] nums, int t){
        int n=nums.length;
        int sum=0;
        for(int i: nums)sum+=i;
        if(Math.abs(t)>sum){
            return 0;
        }
        off=sum;
        dp=new int[n][2*sum+1];
        for(int i[]: dp)Arrays.fill(i,-1);
        return sol(nums,t,0,0);
    }
}
class Solution {
    int dp[];
    public int sol(int a[],int i,int n){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int ta=a[i]+sol(a,i+2,n);
        int nt=sol(a,i+1,n);
        return dp[i]=Math.max(ta,nt);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        dp=new int[n];
        Arrays.fill(dp,-1);
        int v=sol(nums,0,n-1);
        Arrays.fill(dp,-1);
        return Math.max(v,sol(nums,1,n));
    }
}
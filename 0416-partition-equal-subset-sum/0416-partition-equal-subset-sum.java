class Solution {
    Boolean dp[][];
    public boolean sol(int a[],int i,int t){
        if(t<0)return false;
        if(i==a.length)return false;
        if(dp[i][t]!=null)return dp[i][t];
        if(t==0)return true;
        boolean ta=sol(a,i+1,t-a[i]);
        boolean nt=sol(a,i+1,t);
        return dp[i][t]=ta|nt;
    }
    public boolean canPartition(int[] nums) {
        int t=0;
        int n=nums.length;
        for(int i=0;i<n;i++)t+=nums[i];
        if(t%2==1)return false;
        int tar=t/2;
        dp=new Boolean[n][tar+1];
        return sol(nums,0,tar);
    }
}
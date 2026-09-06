class Solution {
    static int dp[][];
    public static int sol(String s,String t, int i,int j){
        if(j==t.length())return 1;
        if(i==s.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=sol(s,t,i+1,j);
        if(s.charAt(i)==t.charAt(j)){
            ans+=sol(s,t,i+1,j+1);
        }
        return dp[i][j]=ans;
    }
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        dp=new int[n][m];
        for(int[] r: dp)Arrays.fill(r,-1);
        return sol(s,t,0,0);
    }
}
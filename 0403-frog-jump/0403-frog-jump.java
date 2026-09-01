class Solution {
    Map<Integer,Integer> m=new HashMap<>();
    Boolean [][]dp;
    public boolean sol(int i,int p,int n,int st[]){
        if(i==n-1)return true;
        if(dp[i][p]!=null)return dp[i][p];
        if(p-1>0 && m.containsKey(st[i]+p-1)){
            int nx=m.get(st[i]+p-1);
            if(sol(nx,p-1,n,st))return dp[i][p]=true;
        }
        if(p>0 && m.containsKey(st[i]+p)){
            int nx=m.get(st[i]+p);
            if(sol(nx,p,n,st))return dp[i][p]=true;
        }
        if(p+1<n && m.containsKey(st[i]+p+1)){
            int nx=m.get(st[i]+p+1);
            if(sol(nx,p+1,n,st))return dp[i][p]=true;
        }
        return dp[i][p]=false;
    }
    public boolean canCross(int[] st) {
        int n=st.length;
        if(n==1)return true;
        if(st[1]!=1)return false;
        dp=new Boolean[n][n+1];
        for(int i=0;i<n;i++){
            m.put(st[i],i);
        }
        return sol(1,1,n,st);
    }
}
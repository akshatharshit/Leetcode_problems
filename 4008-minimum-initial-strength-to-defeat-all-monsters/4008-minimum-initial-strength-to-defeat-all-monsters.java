class Solution {
    public long minInitialStrength(int[] m, int[][] b) {
        int n=m.length;
        long v[]=new long[n+1];
        for(int i[]: b){
            v[i[0]]+=i[2];
            if(i[1]+1<n+1)v[i[1]+1]-=i[2];
        }
        long ans=0,va=0,vp=0;
        for(int i=0;i<n;i++){
            va+=v[i];
            if(va<m[i])ans=Math.max(ans,vp+m[i]-va);
            vp+=m[i];
        }
        return ans;
    }
}
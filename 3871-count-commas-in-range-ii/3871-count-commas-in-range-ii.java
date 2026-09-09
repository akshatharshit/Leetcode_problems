class Solution {
    public long countCommas(long n) {
        long ans=0;
        long car=1;
        long ls=1000;
        while(ls<=n){
            long v=ls*1000-1;
            long m=Math.min(n,v);
            long neg=ls-1;
            long cal=m-neg;
            if(cal>0)ans+=cal*car;
            ls*=1000;
            car++;
        }
        return ans;
    }
}
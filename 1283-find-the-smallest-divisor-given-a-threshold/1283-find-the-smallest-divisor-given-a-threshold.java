class Solution {
    public int sum(int[] a,int m){
        int sum=0;
        for(int i: a)sum+=(i+m-1)/m; //ceil
        return sum;
    }
    public int smallestDivisor(int[] a, int t) {
        int ma=1000000;
        int s=1;
        // for(int i: a){
        //     ma=Math.max(ma,i);
        // }
        int e=ma;
        int ans=0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(sum(a,m)<=t){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        System.gc();
        return ans;
    }
}
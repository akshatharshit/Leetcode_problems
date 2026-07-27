class Solution {
    public boolean p(int a[],int m,int h){
        long ho=0;
        for(int i: a){
            // ho+=Math.ceil((double)i/m);
            ho+=(long)(i+m-1)/m;
        }
        return ho<=h;
    }
    public int minEatingSpeed(int[] pi, int hi) {
        int n=pi.length;
        int l=1;
        int h=Integer.MIN_VALUE;
        int ans=-1;
        for(int i: pi)h=Math.max(h,i);
        while(l<=h){
            int m=l+(h-l)/2;
            if(p(pi,m,hi)){
               ans=m;
               h=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}
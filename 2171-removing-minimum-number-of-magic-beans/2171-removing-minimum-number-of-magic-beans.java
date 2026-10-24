class Solution {
    public long minimumRemoval(int[] beans) {
        int n=beans.length;
        Arrays.sort(beans);
        long sum=0;
        long mi=Long.MAX_VALUE;
        for(int i: beans){
            sum+=i;
        }
        for(int i=0;i<n;i++){
            long rem=(long)beans[i]*(n-i);
            long mov=sum-rem;
            mi=Math.min(mi,mov);
        }
        return mi;
    }
}
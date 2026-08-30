class Solution {
    public int minimumDeletions(int[] nums) {
        int mi=-1;
        int ma=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                mi=i;
            }
            if(nums[i]>max){
                max=nums[i];
                ma=i;
            }
        }
        int one=Math.max(ma,mi)+1;
        int tw=n-Math.min(ma,mi);
        int th=0;
        if(mi<ma){
            th=mi+n-ma+1;
        }else if(mi>ma){
            th=ma+n-mi+1;
        }else{
            th=ma+n-ma+1;
        }
        return Math.min(one,Math.min(tw,th));
    }
}
class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int s=0;
        int d=0;
        for(int i: nums){
            s+=i;
            while(i>0){
                int r=i%10;
                i/=10;
                d+=r;
            }
        }
        return Math.abs(s-d);
    }
}
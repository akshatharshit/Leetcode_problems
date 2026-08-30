class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean b[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(nums[i]>=1 && nums[i]<=n){
                b[nums[i]-1]=true;
            }
        }
        for(int i=0;i<n;i++){
            if(!b[i]){
                return i+1;
            }
        }
        return n+1;
    }
}
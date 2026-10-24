class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int ans=0;
       int n=nums.length;
       int v=nums[n/2];
       for(int i=0;i<n;i++){
        ans+=Math.abs(nums[i]-v);
       }   
       return ans;
    }
}
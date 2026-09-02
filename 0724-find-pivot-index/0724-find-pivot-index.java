class Solution {
    public int pivotIndex(int[] nums) {
        int s=0;
        for(int i: nums)s+=i;
        int ans=-1;
        int rs=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            // if(rs>s-nums[i]-rs)return ans;
            if(rs==s-nums[i]-rs){
                return i;
            }
            rs+=nums[i];
        }
        return ans;
    }
}
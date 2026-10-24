class Solution {
    public int minOperations(int[] nums, int x) {
          int n=nums.length;
          int sum=0;
          for(int i: nums)sum+=i;
          int tar=sum-x;
          int s=0;
          int j=0;
          int ans=-1;
          for(int i=0;i<n;i++){
            s+=nums[i];
            while(s>tar && j<=i){
                    s-=nums[j];
                    j++;
            }
            if(s==tar){
                ans=Math.max(ans,i-j+1);
            }
          }
          return ans==-1?-1:n-ans;
    }
}
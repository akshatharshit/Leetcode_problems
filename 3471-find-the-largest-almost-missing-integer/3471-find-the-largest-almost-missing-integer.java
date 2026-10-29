class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int f[]=new int[51];
        for(int i=0;i<=n-k;i++){
            boolean s[]=new boolean[51];
            for(int j=i;j<i+k;j++){
                s[nums[j]]=true;
            }
            for(int x=0;x<=50;x++){
                if(s[x])f[x]++;
            }
        }
        for(int x=50;x>=0;x--){
            if(f[x]==1)return x;
        }
        return -1;
    }
}
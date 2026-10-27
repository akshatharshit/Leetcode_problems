class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> ans=new ArrayList<>();
        if(n==0)return ans;
        StringBuilder sb=new StringBuilder();
        // sb.append(nums[0]);
        // for(int i=1;i<n;i++){
        //     if(nums[i-1]+1==nums[i]){
        //         sb.append("->");
        //         sb.append(nums[i]);
        //     }else{
        //         ans.add(sb.toString());
        //         sb.setLength(0);
        //         sb.append(nums[i]);
        //     }
        // }
        // ans.add(sb.toString());
        int i=0;
        while(i<n){
            int s=nums[i];
            while(i+1<n && nums[i]+1==nums[i+1]){
                i++;
            }
            int e=nums[i];
            if(s==e){
                ans.add((new StringBuilder()).append(s).toString());
            }else{
                ans.add(s+ "->" +e);
            }
            i++;
        }
        return ans;
    }
}
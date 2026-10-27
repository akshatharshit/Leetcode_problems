class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i: nums){
            if(s.contains(i)){
                s.remove(i);
            }else{
                s.add(i);
            }
        }
        int ans[]=new int[2];
        int j=0;
        for(int i: s)ans[j++]=i;
        return ans;
    }
}
class Solution {
    public List<Integer> findLonely(int[] nums) {
         Map<Integer,Integer> m=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
         }
         List<Integer> ans=new ArrayList<>();
         for(int i: m.keySet()){
            if(m.get(i)==1 && !m.containsKey(i+1) && !m.containsKey(i-1)){
                ans.add(i);
            }
         }
         return ans;
    }
}
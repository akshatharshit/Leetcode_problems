class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        int c=0;
        for(int i: nums){
            if(i==target)l.add(c);
            c++;
        }
        return l;
    }
}
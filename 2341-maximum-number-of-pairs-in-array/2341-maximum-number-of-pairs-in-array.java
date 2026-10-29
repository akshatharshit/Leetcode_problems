class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i: nums)m.put(i,m.getOrDefault(i,0)+1);
        int p=0;
        int le=0;
        for(int i: m.keySet()){
            int v=m.get(i);
            p+=v/2;
            le+=v%2;
        }
        return new int[]{p,le};
    }
}
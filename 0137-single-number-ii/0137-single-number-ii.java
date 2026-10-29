class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer,Integer> m=new HashMap<>();
        // for(int i: nums)m.put(i,m.getOrDefault(i,0)+1);
        // for(int i: m.keySet())if(m.get(i)==1)return i;
        // return -1; 
        int one=0;
        int two=0;
        for(int i: nums){
            one=(one^i)&~two;
            two=(two^i)&~one;
        }
        return one;
    }
}
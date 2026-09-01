class Solution {
    Map<Integer,Integer> m=new HashMap<>();
    public int climbStairs(int n) {
        //Base Case
        if(n==1 || n==2)return n;
        //overlapping 
        if(m.containsKey(n))return m.get(n);
        int v=climbStairs(n-1)+climbStairs(n-2);
        m.put(n,v);
        return v;
    }
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty() && nums2[i]>s.peek()){
                m.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty()){
           m.put(s.pop(),-1);
        }
        int si=nums1.length;
        int ans[]=new int[si];
        for(int i=0;i<si;i++){
            ans[i]=m.get(nums1[i]);
        }
        return ans;
    }
}
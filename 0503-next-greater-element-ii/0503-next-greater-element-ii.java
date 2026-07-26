class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        Stack<Integer> s=new Stack<>();
        Arrays.fill(a,-1);
        for(int i=0;i<2*n;i++){
            int v=nums[i%n];
            while(!s.isEmpty() && nums[s.peek()]<v){
                a[s.pop()]=v;
            }
            if(i<n){
                s.push(i);
            }
        }
        return a;
    }
}
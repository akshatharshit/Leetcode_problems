class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i : asteroids){
            boolean add=true;
            while(!st.isEmpty() && i<0 && st.peek()>=0){
                if(st.peek()>-i){
                     add=false;
                }else if(st.peek()<-i){
                    st.pop();
                }else{
                    st.pop();
                    add=false;
                }
                if(!add)break;
            }
            if(add)st.push(i);
        }
        int ans[]=new int[st.size()];
        int id=ans.length-1;
        while(!st.isEmpty()){
            ans[id--]=st.pop();
        }
        return ans;
    }
}
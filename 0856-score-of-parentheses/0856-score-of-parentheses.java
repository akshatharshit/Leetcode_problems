class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char ch: s.toCharArray()){
            if(ch=='('){
                st.push(0);
            }else{
                int v=st.pop();
                int sc=(v==0)?1:2*v;
                st.push(st.pop()+sc);
            }
        } 
        return st.pop();
    }
}
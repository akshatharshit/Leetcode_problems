class Solution {
    Boolean dp[];
    Set<String> st;
    public boolean sol(String s,int id){
        if(id==s.length())return true;
        if(dp[id]!=null)return dp[id];
        for(int i=id;i<s.length();i++){
            String w=s.substring(id,i+1);
            if(st.contains(w) && sol(s,i+1))return dp[id]=true;
        }
        return dp[id]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        dp=new Boolean[s.length()];
        st=new HashSet<>(wordDict);
        return sol(s,0);
    }
}
class Solution {
    List<String> ans;
    public void sol(int i,int n,int pr,String s){
        if(i==n){
            ans.add(s);
            return;
        }
        if(pr!=0){
            sol(i+1,n,0,s+"0");
        }
        sol(i+1,n,1,s+"1");
    }
    public List<String> validStrings(int n) {
        ans=new ArrayList<>();
        sol(0,n,-1,"");
        return ans;
    }
}
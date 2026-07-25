class Solution {
    public void sol(int t,int[] c,int i,List<List<Integer>> ans,List<Integer> a){
        if(t==0){
            ans.add(new ArrayList<>(a));
            return;
        }
        if(i==c.length || t<0)return;
        // for(int i=idx;i<c.length;i++){
        //     a.add(c[i]);
        //     sol(t-c[i],c,i,ans,a);
        //     a.remove(a.size()-1);
        // }
        a.add(c[i]);
        sol(t-c[i],c,i,ans,a);
        a.remove(a.size()-1);
        sol(t,c,i+1,ans,a);
    }
    public List<List<Integer>> combinationSum(int[] c, int t) {
       List<List<Integer>> ans=new ArrayList<>();
       sol(t,c,0,ans,new ArrayList<>());
       return ans;
    }
}
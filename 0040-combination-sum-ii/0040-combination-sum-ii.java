class Solution {
    public void sol(int t,int[]c,List<List<Integer>> ans,List<Integer> a,int i){
        if(t==0){
            ans.add(new ArrayList<>(a));
            return;
        }
        if(i==c.length || t<0)return;
        // for(int i=idx;i<c.length;i++){
        //     if(i>idx && c[i]==c[i-1])continue;
        //     l.add(c[i]);
        //     sol(c,t-c[i],ans,l,i+1);
        //     l.remove(l.size()-1);
        // }
        a.add(c[i]);
        sol(t-c[i],c,ans,a,i+1);
        a.remove(a.size()-1);
        int j = i;
        while (j + 1 < c.length && c[j] == c[j + 1]) {
            j++;
        }
        sol(t,c,ans,a,j+1);
    }
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(c);
        sol(t,c,ans,new ArrayList<>(),0);
        return ans;
    }
}
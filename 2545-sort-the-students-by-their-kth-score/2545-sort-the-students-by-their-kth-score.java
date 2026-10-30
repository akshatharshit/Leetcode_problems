class Solution {
    class In{
        int id;
        int v;
        In(int id,int v){
            this.id=id;
            this.v=v;
        }
    }
    public int[][] sortTheStudents(int[][] score, int k) {
        int n=score.length;
        int m=score[0].length;
        In a[]=new In[n];
        for(int i=0;i<n;i++){
            int val=score[i][k];
            a[i]=new In(i,val);
        }
        Arrays.sort(a,(b,c)->Integer.compare(c.v,b.v));
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            ans[i]=score[a[i].id];
        }
        return ans;
    }
}
class Solution {
    class In{
        String s;
        int id;
        In(String s,int id){
            this.s=s;
            this.id=id;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        In a[]=new In[n];
        for(int i=0;i<n;i++){
            a[i]=new In(names[i],heights[i]);
        }
        //desc order sorting 
        Arrays.sort(a,(b,c)->Integer.compare(c.id,b.id));
        for(int i=0;i<n;i++){
            names[i]=a[i].s;
        }
        return names;
    }
}
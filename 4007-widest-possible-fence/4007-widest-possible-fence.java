class Solution {
    public int maximumWidth(int[] p) {
       Map<Long,Integer> m=new HashMap<>();
        for(int i: p)m.put((long)i,m.getOrDefault((long)i,0)+1);
        List<long[]> al=new ArrayList<>();
        for(Map.Entry<Long,Integer> e: m.entrySet())
            al.add(new long[]{e.getKey(),e.getValue()});
        Map<Long,Integer> ans=new HashMap<>();
        for(long[] i: al)ans.put(i[0],ans.getOrDefault(i[0],0)+(int)i[1]);
        int n=al.size();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long t=al.get(i)[0]+al.get(j)[0];
                int va;
                if(i==j){
                    va=(int)(al.get(i)[1]/2);
                }else{
                    va=(int)Math.min(al.get(i)[1],al.get(j)[1]);
                }
                ans.put(t,ans.getOrDefault(t,0)+va);
            }
        }
        int r=1;
        for(int i: ans.values())r=Math.max(r,i);
        return r;
    }
}
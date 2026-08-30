class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()==0 || words.length==0)return ans;
        int wl=words[0].length();
        int wc=words.length;
        int tl=wl*wc;
        if(tl>s.length())return ans;
        Map<String,Integer> m=new HashMap<>();
        for(String i: words){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i=0;i<wl;i++){
            int l=i;
            int r=i;
            int c=0;
            Map<String,Integer> cur=new HashMap<>();
            while(r+wl<=s.length()){
                String w=s.substring(r,r+wl);
                r+=wl;
                if(m.containsKey(w)){
                    cur.put(w,cur.getOrDefault(w,0)+1);
                    c++;
                    while(cur.get(w)>m.get(w)){
                        String lw=s.substring(l,l+wl);
                        cur.put(lw,cur.get(lw)-1);
                        l+=wl;
                        c--;
                    }
                    if(c==wc){
                        ans.add(l);
                        String lw=s.substring(l,l+wl);
                        cur.put(lw,cur.get(lw)-1);
                        l+=wl;
                        c--;
                    }
                }else{
                    cur.clear();
                    c=0;
                    l=r;
                }
            }
        }
        return ans;
    }
}
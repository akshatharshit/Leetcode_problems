class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        int c=0;
        for(String s: words){
            // if(s.contains(x))ans.add(c);
            if(s.indexOf(x)!=-1)ans.add(c);
            c++;
        }
        return ans;
    }
}
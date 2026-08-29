class Solution {
    public int numJewelsInStones(String j, String s) {
        Set<Character> st=new HashSet<>();
        for(char ch: j.toCharArray())st.add(ch);
        int ans=0;
        for(char ch: s.toCharArray())if(st.contains(ch))ans++;
        return ans;
    }
}
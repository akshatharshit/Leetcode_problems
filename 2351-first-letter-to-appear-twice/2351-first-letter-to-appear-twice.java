class Solution {
    public char repeatedCharacter(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char ch: s.toCharArray()){
           m.put(ch,m.getOrDefault(ch,0)+1);
           if(m.get(ch)==2)return ch;
        }
        return 'a';
    }
}
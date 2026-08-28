class Solution {
    String r="";
    public boolean sol(StringBuilder sb,int f[],String tar,int i,boolean isg){
        if(i==tar.length()){
            if(isg){
                r=sb.toString();
                return true;
            }
            return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(f[ch-'a']==0)continue;
            if(!isg && ch<tar.charAt(i))continue;
            sb.append(ch);
            f[ch-'a']--;
            boolean g=isg||ch>tar.charAt(i);
            if(sol(sb,f,tar,i+1,g))return true;
            sb.deleteCharAt(sb.length()-1);
            f[ch-'a']++;
        }
        return false;
    }
    public String lexGreaterPermutation(String s, String tar) {
        int f[]=new int[26];
        for(char ch: s.toCharArray()){
            f[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        sol(sb,f,tar,0,false);
        return r;
    }
}
class Solution {
    public String lexGreaterPermutation(String s, String tar) {
        int n=s.length();
        int f[]=new int[26];
        for(char ch: s.toCharArray()){
            f[ch-'a']++;
        }
        for(int i=n-1;i>=0;i--){
            boolean p=true;
            int r[]=f.clone();
            for(int j=0;j<i;j++){
                if(r[tar.charAt(j)-'a']==0){
                    p=false;
                    break;
                }
                r[tar.charAt(j)-'a']--;
            }
            if(!p)continue;
            int t=tar.charAt(i)-'a';
            for(int j=t+1;j<26;j++){
                if(r[j]>0){
                    StringBuilder sb=new StringBuilder();
                    sb.append(tar.substring(0,i));
                    sb.append((char)('a'+j));
                    r[j]--;
                    for(int k=0;k<26;k++){
                        while(r[k]>0){
                            sb.append((char)('a'+k));
                            r[k]--;
                        }
                    }
                    return sb.toString();
                }
            }
        }
       return "";
    }
}
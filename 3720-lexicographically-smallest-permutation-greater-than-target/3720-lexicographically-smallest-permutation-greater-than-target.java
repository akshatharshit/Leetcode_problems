class Solution {
    public String lexGreaterPermutation(String s, String tar) {
        int n=s.length();
        int[] f=new int[26];
        for(char c:s.toCharArray()){
            f[c-'a']++;
        }
        for(int i=n-1;i>=0;i--){
            int rem[]=f.clone();
            boolean pos=true;
            for(int k=0;k<i;k++){
                int idx=tar.charAt(k)-'a';
                if(rem[idx]==0){
                    pos=false;
                    break;
                }
                rem[idx]--;
            }
            if(!pos)continue;
            int t=tar.charAt(i)-'a';
            for(int j=t+1;j<26;j++){
                if(rem[j]>0){
                    StringBuilder ans=new StringBuilder();
                    ans.append(tar.substring(0,i));
                    ans.append((char)('a'+j));
                    rem[j]--;
                    for(int k=0;k<26;k++){
                        while(rem[k]>0){
                            ans.append((char)('a'+k));
                            rem[k]--;
                        }
                    }
                    return ans.toString();
                }
            }
            // if(rem[t]>0){
            //     rem[t]--;
            // }else{
            //     break;
            // }
        }
        return "";
    }
}
class Solution {

    public String Palindrome(StringBuilder s,int od){
           StringBuilder sb=new StringBuilder();
           sb.append(s);
           if(od!=-1)sb.append((char)('a'+od));
           sb.append(new StringBuilder(s).reverse());
           return sb.toString();
    }


    public String lexPalindromicPermutation(String s, String tar) {
        int n=s.length();
        int f[]=new int[26];
        for(char ch: s.toCharArray()){
            f[ch-'a']++;
        }
        int od=-1;
        for(int i=0;i<26;i++){
            if(f[i]%2==1){
                if(od!=-1){
                    return "";
                }
                od=i;
            }
        }
        int ha=n/2;
        int h[]=new int[26];
        for(int i=0;i<26;i++){
            h[i]=f[i]/2;
        }

        // first check extact equal
        // first check extact equal
        int rem[]=h.clone();
            boolean p=true;
            for(int i=0;i<ha;i++){
                int ta=tar.charAt(i)-'a';
                if(rem[ta]==0){
                    p=false;
                    break;
                }
                rem[ta]--;
            }
             if(p){
                    StringBuilder sb=new StringBuilder();
                    sb.append(tar.substring(0,ha));
                    String can=Palindrome(sb,od);
                    if(can.compareTo(tar)>0)return can;
            }


//try greater
        for(int i=ha-1;i>=0;i--){
            int r[]=h.clone();
            boolean pos=true;
            for(int j=0;j<i;j++){
                int ta=tar.charAt(j)-'a';
                if(r[ta]==0){
                    pos=false;
                    break;
                }
                r[ta]--;
            }
            if(!pos)continue;
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
                    return Palindrome(sb,od);
                }
            }
        }
        // if(n%2==1){
            // int r[]=h.clone();
            // boolean p=true;
            // for(int i=0;i<ha;i++){
            //     int ta=tar.charAt(i)-'a';
            //     if(r[ta]==0){
            //         p=false;
            //         break;
            //     }
            //     r[ta]--;
            // }
            // if(p){
            //     // int ntar=tar.charAt(ha)-'a';
            //     // if(od>ntar){
            //         StringBuilder sb=new StringBuilder();
            //         sb.append(tar.substring(0,ha));
            //         String can=Palindrome(sb,od);
            //         if(can.compareTo(tar)>0)return can;
            //     // }
            // }
        // }
        return "";
    }
}
class Solution {
    public boolean sumGame(String num) {
        int s1=0;
        int s2=0;
        int fh=0;
        int sh=0;
        int n=num.length();
        for(int i=0;i<n/2;i++){
            char ch=num.charAt(i);
            if(ch=='?')fh++;
            else s1+=ch-'0';
        }
        for(int i=n/2;i<n;i++){
            char ch=num.charAt(i);
            if(ch=='?')sh++;
            else s2+=ch-'0';
        }
        boolean ans=true;
        if(fh==sh){
            if(s1==s2){
                return false;
            }
        }else if(sh>fh){
            int d=sh-fh;
            int dv=s2-s1;
            // if(dv<0)return true;
            // if(dv%9==0){
            //     if(d%2==0)return false;
            //     else return true;
            // }else return true;
            if(2*dv==-9*d)return false;
            else return true;
        }else{
            int d=fh-sh;
            int dv=s1-s2;
            // if(dv<0)return true;
            // if(dv%9==0){
            //     if(d%2==0)return false;
            //     else return true;
            // }else return true;
            if(2*dv==-9*d)return false;
            else return true;
        }
        return ans;
    }
}
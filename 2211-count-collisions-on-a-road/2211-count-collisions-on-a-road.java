class Solution {
    public int countCollisions(String directions) {
        int ans=0;
        int r=0;
        boolean st=false;
        for(char ch: directions.toCharArray()){
             if(ch=='R')r++;
             else if(ch=='S'){
                if(r>0){
                    ans+=r;
                    r=0;
                }
                st=true;
             }else{
                if(r>0){
                    ans+=r-1;
                    ans+=2;
                    r=0;
                    st=true;
                }else if(st){
                    ans++;
                }
             }
        }  
        return ans; 
    }
}
class Solution {
    public int countCollisions(String d) {
       int n=d.length()-1; 
       int i=0;
       while(i<=n && d.charAt(i)=='L')i++;
       int j=n;
       while(j>=0 && d.charAt(j)=='R' )j--;
       int ans=0;
       for(int l=i;l<=j;l++){
        if(d.charAt(l)!='S')ans++;
       }
       return ans;
    }
}
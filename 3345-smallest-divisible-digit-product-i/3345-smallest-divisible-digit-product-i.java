class Solution {
    int pro(int v){
        int p=1;
        while(v!=0){
            int val=v%10;
            p*=val;
            v/=10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            if(pro(n)%t==0)return n;
            n++;
        }
    }
}
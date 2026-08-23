class Solution {
    public boolean checkDivisibility(int n) {
        long ch=(long)n;
        long mul=1;
        long sum=0;
        while(ch!=0){
            long rem=ch%10;
            mul*=rem;
            sum+=rem;
            ch/=10;
        }
        return (long)n%(mul+sum)==0;
    }
}
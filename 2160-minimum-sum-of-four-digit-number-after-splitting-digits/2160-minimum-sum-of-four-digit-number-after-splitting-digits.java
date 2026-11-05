class Solution {
    public int minimumSum(int num) {
        int a[]=new int[4];
        int c=0;
        while(num>0){
            int v=num%10;
            num/=10;
            a[c++]=v;
        }
        Arrays.sort(a);
        int v1=a[0];
        int v2=a[1];
        v1=v1*10+a[3];
        v2=v2*10+a[2];
        return v1+v2;
    }
}
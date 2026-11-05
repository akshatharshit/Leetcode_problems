class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int m=arr[(n-1)/2];
        int s=0;
        int e=n-1;
        int ans[]=new int[k];
        for(int x=0;x<k;x++){
            if(Math.abs(arr[s]-m)>Math.abs(arr[e]-m)){
                ans[x]=arr[s];
                s++;
            }else{
                ans[x]=arr[e];
                e--;
            }
        }
        System.gc();
        return ans;  
    }
}
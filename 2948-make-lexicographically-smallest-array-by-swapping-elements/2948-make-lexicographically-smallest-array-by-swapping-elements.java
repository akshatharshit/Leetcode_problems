class Solution {
    public void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=nums[i];
            a[i][1]=i;
        }
        Arrays.sort(a,(b,c)->(b[0]-c[0]));
        int i=0;
        for(;i<n;){
            int j=i;
            while(j+1<n && a[j+1][0]-a[j][0]<=limit){
                j++;
            }
            List<Integer> in=new ArrayList<>();
            for(int k=i;k<=j;k++){
                in.add(a[k][1]);
            }
            Collections.sort(in);
            for(int k=i;k<=j;k++){
                nums[in.get(k-i)]=a[k][0];
            }
            i=j+1;
        }
        return nums;
    }
}
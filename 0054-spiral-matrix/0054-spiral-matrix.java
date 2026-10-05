class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> li=new ArrayList<>();
        int l=0;
        int r=m[0].length-1;
        int t=0;
        int b=m.length-1;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                li.add(m[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                li.add(m[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    li.add(m[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    li.add(m[i][l]);
                }
                l++;
            }
        }
        return li;
    }
}
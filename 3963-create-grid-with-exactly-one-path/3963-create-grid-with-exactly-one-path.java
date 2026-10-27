class Solution {
    public String[] createGrid(int m, int n) {
        String ans[]=new String[m];
        if(m==1 && n==1){
            ans[0]=".";
            return ans;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            if(i==0){
                int j=0;
                while(j<n){
                    sb.append('.');
                    j++;
                }
            }else{
                int j=0;
                while(j<n-1){
                    sb.append('#');
                    j++;
                }
                sb.append('.');
            }
            ans[i]=sb.toString();
            sb.setLength(0);
        }
        return ans;
    }
}
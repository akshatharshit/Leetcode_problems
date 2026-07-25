class Solution {
    int n=0;
    int m=0;
    int[][] dir={{0,-1},{-1,0},{0,1},{1,0}};
    public boolean dfs(char[][] b,boolean[][]vis,String w,int i,int j,int k){
        if(k==w.length())return true;
        vis[i][j]=true;
        for(int d[]: dir){
            int nx=i+d[0];
            int ny=j+d[1];
            if(nx>=0 && ny>=0 && nx<n && ny<m && !vis[nx][ny] && w.charAt(k)==b[nx][ny]){
                if(dfs(b,vis,w,nx,ny,k+1))return true;
            }
        }
        vis[i][j]=false;
        return false;
    }
    public boolean exist(char[][] b, String w) {
        n=b.length;
        m=b[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(b[i][j]==w.charAt(0) && dfs(b,vis,w,i,j,1)){
                    return true;
                }
            }
        }
        return false;
    }
}
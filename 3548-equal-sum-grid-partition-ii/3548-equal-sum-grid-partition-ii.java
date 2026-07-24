class Solution {
    long to=0;
    //checking the cut and also the connected part
    //work for both hozizontal cut and with transpose for vertical cut;  
    public boolean chH(int [][]grid){
        int m=grid.length;
        int n=grid[0].length;
        HashSet<Long> s=new HashSet<>();
        long t=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                s.add((long)grid[i][j]);
                t+=grid[i][j];
            }
            long bo=to-t;
            long diff=t-bo;
            if(diff==0)return true;
            if(diff==grid[0][0])return true;
            if(diff==grid[0][n-1])return true;
            if(diff==grid[i][0])return true;
            if(i>0 && n>1 && s.contains(diff))return true;
        }
        return false;
    }

    //reversing for bottom to top check
    public void rev(int[][] grid){
        int t=0;
        int b=grid.length-1;
        while(t<b){
            int []te=grid[t];
            grid[t]=grid[b];
            grid[b]=te;
            t++;
            b--;
        }
        
    }
    public boolean canPartitionGrid(int[][] grid) {
          int m=grid.length;
          int n=grid[0].length;

          //total cal
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                to+=grid[i][j];
            }
          }

          //checking for horizontal cut top to buttom
          if(chH(grid))return true;
          rev(grid);
          //bottom to up
          if(chH(grid))return true;
          rev(grid);

          //for vertical cut 
          int[][] transpose=new int[n][m];
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[j][i]=grid[i][j];
            }
          }
          //checking for vertical cut top to buttom
          if(chH(transpose))return true;
          rev(transpose);
          //buttom to up
          if(chH(transpose))return true;
          return false;
    }
}
class Solution {
    public boolean uniformArray(int[] nums1) {
          boolean odd=false;
          int min=Integer.MAX_VALUE;
          for(int i: nums1){
            if(i%2==1){
                odd=true;
            }
            min=Math.min(i,min);
          }
          if(min%2==1)return true;
          return !odd;
    }
}
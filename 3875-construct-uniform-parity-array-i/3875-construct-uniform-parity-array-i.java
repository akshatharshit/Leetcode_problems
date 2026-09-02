class Solution {
    public boolean uniformArray(int[] nums1) {
        int od=0;
        int ev=0;
        int n=nums1.length;
        for(int i: nums1){
            if(i%2==0)ev++;
            else od++;
        }
        if(ev==od || ev==n || od==n || od>ev || ev>od){
            return true;
        }else{
            return false;
        }
    }
}
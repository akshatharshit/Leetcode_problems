class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        boolean ans=true;
        long sum=mass;
        for(int i: asteroids){
            if(sum<i){
                ans=false;
                break;
            }else{
                sum+=i;
            }
        }
        return ans;
    }
}
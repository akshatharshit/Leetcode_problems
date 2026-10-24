class Solution {
    public int convertTime(String current, String correct) {
        String[] p1=current.split(":");
        String[] p2=correct.split(":");
        int ch=Integer.parseInt(p1[0]);
        int cm=Integer.parseInt(p1[1]);
        int nh=Integer.parseInt(p2[0]);
        int nm=Integer.parseInt(p2[1]);
        int cur=ch*60+cm;
        int next=nh*60+nm;
        int di=next-cur;
        int ans=0;
        ans+=di/60;
        di=di%60;
        ans+=di/15;
        di=di%15;
        ans+=di/5;
        di=di%5;
        ans+=di;
        return ans;
    }
}
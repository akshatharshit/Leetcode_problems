class Solution {
    public int day(String d,int days[]){
        String[] p=d.split("-");
        int mo=Integer.parseInt(p[0]);
        int da=Integer.parseInt(p[1]);
        int to=da;
        for(int i=0;i<mo-1;i++){
            to+=days[i];
        }
        return to;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
           int[] d={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
           int sa=day(arriveAlice,d);
           int ea=day(leaveAlice,d);
           int sb=day(arriveBob,d);
           int eb=day(leaveBob,d);
           int st=Math.max(sa,sb);
           int end=Math.min(ea,eb);
           return Math.max(0,end-st+1);
    }
}
// 2409. Count Days Spent Together
class Solution {
    int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1 = totalNoOfDays(arriveAlice);
        int a2 = totalNoOfDays(leaveAlice);
        int b1 = totalNoOfDays(arriveBob);
        int b2 = totalNoOfDays(leaveBob);
        if(a2<b1 || b2<a1)
            return 0;
        int together=0;
        together = Math.abs(Math.max(a1,b1)-Math.min(a2,b2))+1;
        return together;
        
    }
    public int totalNoOfDays(String s)
    {
        int tot=0;
        int month = Integer.parseInt(s.substring(0,2));
        int days = Integer.parseInt(s.substring(3,5));
        for(int i=0;i<month-1;i++)
        {
            tot+=daysPerMonth[i];
        }
        tot+=days;
        return tot;
    }
}

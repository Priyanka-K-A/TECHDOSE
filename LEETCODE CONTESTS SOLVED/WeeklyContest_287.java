// 2224. Minimum Number of Operations to Convert Time
class Solution {
    public int convertTime(String current, String correct) {
        int currHr = Integer.parseInt(current.substring(0,2));
        int corrHr = Integer.parseInt(correct.substring(0,2));
        int currmin = Integer.parseInt(current.substring(3,5));
        int corrmin = Integer.parseInt(correct.substring(3,5));
        int count=0;
        int rem = ((corrHr*60)+corrmin)-((currHr*60)+currmin);
        while(rem>=60)
        {
            rem-=60;count++;
        }
        while(rem>=15)
        {
            rem-=15;count++;
        }
        while(rem>=5)
        {
            rem-=5;count++;
        }
        while(rem>=1)
        {
            rem-=1;count++;
        }
        return count;
    }
}


//2347. Best Poker Hand
class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int[] count = new int[14];
        int[] c1 = new int[4];
        int max = Integer.MIN_VALUE;
        char ch = suits[0];
        int flag=0;
        for(int i=0;i<ranks.length;i++)
        {
            count[ranks[i]]++;
            max = Math.max(max,count[ranks[i]]);
            if(suits[i]==ch)
                flag++;
        }
        if(flag==5)
            return "Flush";
        else if(max==2)
            return "Pair";
        else if(max>2)
            return "Three of a Kind";            
        return "High Card";
        
        
        
    }
}

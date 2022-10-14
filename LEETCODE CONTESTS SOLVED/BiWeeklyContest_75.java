//2220. Minimum Bit Flips to Convert Number
class Solution {
    public int minBitFlips(int start, int goal) {
        int num = start ^ goal;
        int c=0;
        while(num>0)
        {
            if((num&1)==1)
            { 
                c++;
            }
            num>>=1;
        }
        return c;
    }
}

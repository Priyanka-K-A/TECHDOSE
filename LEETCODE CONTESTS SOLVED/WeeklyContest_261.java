//2027. Minimum Moves to Convert String
class Solution {
    public int minimumMoves(String s) {
        int count=0;
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='X')
            {
                i+=2;
                count++;
            }
            i++;
        }
        return count;
    }
}

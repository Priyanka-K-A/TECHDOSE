//2315. Count Asterisks
class Solution {
    public int countAsterisks(String s) {
        int c=0,star=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='|')
                c++;
            if(c%2==0 && s.charAt(i)=='*')
                star++;
        }
        return star;        
    }
}

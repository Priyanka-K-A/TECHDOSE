//2309. Greatest English Letter in Upper and Lower Case
class Solution {
    public String greatestLetter(String s) {
        int len = s.length();
        int[] upperCase = new int[26];
        int[] lowerCase = new int[26];
        String ch="";
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                lowerCase[s.charAt(i)-'a']++;
            }
            else
            {
                upperCase[s.charAt(i)-'A']++;
            }
        }
        for(int i=25;i>=0;i--)
        {
            if(upperCase[i]>=1 && lowerCase[i]>=1)
            {
                ch += (char)(i+65);
                break;
            }
        }
        return ch;
        
    }
}

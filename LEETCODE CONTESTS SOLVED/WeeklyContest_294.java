//2278. Percentage of Letter in String
class Solution {
    public int percentageLetter(String s, char letter) {
        int[] count = new int[26];
        int len = s.length();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if((char)(i+97)==letter)
            {
                ans = (int)(((double)count[i]/len)*100);
            }
        }
        return ans;
    }
}

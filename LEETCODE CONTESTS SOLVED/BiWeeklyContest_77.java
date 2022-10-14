//2255. Count Prefixes of a Given String
class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            String str = s.substring(0,i+1);
            for(int j=0;j<words.length;j++)
            {
                if(str.equals(words[j]))
                {
                    c++;
                }
            }
        }
        return c;
        
    }
}

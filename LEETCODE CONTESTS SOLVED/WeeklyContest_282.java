//2185. Counting Words With a Given Prefix
class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = words.length;
        int slen = pref.length();
        int c=0;
        for(int i=0;i<len;i++)
        {
            if(words[i].length()>=slen)
            {
                String str = words[i].substring(0,slen);
                if(str.equals(pref))
                    c++;
            }
            
        }
        return c;
    }
}

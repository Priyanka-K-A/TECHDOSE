//2423. Remove Letter To Equalize Frequency
class Solution {
    public boolean equalFrequency(String word) {
        int len = word.length();
        int[] count = new int[26];
        for(int i=0;i<len;i++)
        {
            count[word.charAt(i)-'a']++;
        }
        for(int i=0;i<len;i++)
        {
            count[word.charAt(i)-'a']--;
            if(equal(count))
                return true;
            count[word.charAt(i)-'a']++;
        }
        return false;
    }
    public boolean equal(int[] count)
    {
        int c=0;
        for(int i:count)
        {
            if(i==0||c==i)
                continue;
            else if(c==0)
                c=i;
            else
                return false;                
        }
        return true;
    }
}

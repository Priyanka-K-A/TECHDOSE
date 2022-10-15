//2124. Check if All A's Appears Before All B's
class Solution {
    public boolean checkString(String s) {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)=='b')
                {
                    if(s.charAt(j)=='a')
                        return false;
                }
            }
        }
        return true;
    }
}

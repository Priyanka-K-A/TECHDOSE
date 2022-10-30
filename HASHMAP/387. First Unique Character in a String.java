class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[126];
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(count[s.charAt(i)]==1)
            {
                k=i;
                break;
            }
            else
            {
                k=-1;
            }
        }
        return k;
    }
}

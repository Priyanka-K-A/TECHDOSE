//2399. Check Distances Between Same Letters
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int k=0,s1=0;
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    k = (int)s.charAt(i);
                    if((j-i-1)!=distance[k-97])
                    {
                        s1=1;
                        break;
                    }
                }
            }
        }
        return (s1==1)?false:true;
    }
}

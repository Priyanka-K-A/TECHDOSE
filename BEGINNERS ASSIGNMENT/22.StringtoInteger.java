class Solution {
    public int myAtoi(String s) {
        int num=0,sign=1,i=0,val=0;
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
        if(i<s.length() && s.charAt(i)=='+')
        {
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        while(i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9'))
        {
            val = s.charAt(i)-'0';
            if(num>(Integer.MAX_VALUE-val)/10)
            {
                return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            num = num*10+val;
            i++;
        }
        if(num==0)
            return 0;
        else{
            return num*sign;
        }
        
    }
}

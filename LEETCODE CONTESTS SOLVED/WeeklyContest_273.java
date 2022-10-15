//2119. A Number After a Double Reversal
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0;
        int n = num;
        while(num>0)
        {
            int rem = num%10;
            rev1 = rev1*10+rem;
            num/=10;
        }
        int rev2=0;
        while(rev1>0)
        {
            int rem = rev1%10;
            rev2 = rev2*10+rem;
            rev1/=10;
        }
        // System.out.println(rev2);
        return (rev2==n)?true:false;       
        
    }
}

//2180. Count Integers With Even Digit Sum
class Solution {
    public int countEven(int num) {
        int c=0,i=1;
        while(i<=num)
        {
            if(evendigits(i))
                c++;
            i++;
        }
        return c;
    }
    public boolean evendigits(int n)
    {
        int s=0;
        while(n>0)
        {
            int rem = n%10;
            n/=10;
            s+=rem;
        }
        return(s%2==0)?true:false;
    }
}

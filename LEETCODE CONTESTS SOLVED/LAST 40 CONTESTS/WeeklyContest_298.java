//2310. Sum of Numbers With Units Digit K
class Solution {
    public int minimumNumbers(int num, int k) {
        if(num==0)
            return 0;
        if(k==0)
            return (num%10==0)?1:-1;
        
        for(int i=1;i<=num/k;i++)
        {
            if(num%10 == (i*k)%10)
                return i;
        }
        return -1;
    }
}

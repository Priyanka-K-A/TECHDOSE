//2320. Count Number of Ways to Place Houses
class Solution {
    public long noOfWays(int n)
    {
        long sum = 1000000007;
        long n1 = 2;
        long n2 = 3;
        long n3 = 0;
        for(int i=3;i<=n;i++)
        {
            n3 = n1+n2;
            n1 = n2%sum;
            n2 = n3%sum;
        }
        return n3;
    }
    public int countHousePlacements(int n) {
        int ans=0;
        if(n==1)
            return 4;
        else if(n==2)
            return 9;
        else
        {
            long sum = 1000000007;
            ans = (int)(noOfWays(n)*noOfWays(n)%sum);
        }
        return ans;
    }
}

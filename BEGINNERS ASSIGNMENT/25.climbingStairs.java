//DP
class Solution {
    public int climbStairs(int n) {
        int[] c = new int[n+2];
        c[1]=1;
        c[2]=2;
        for(int i=3;i<=n;i++)
        {
            c[i] = c[i-1]+c[i-2];
        }
        return c[n];
    }
}

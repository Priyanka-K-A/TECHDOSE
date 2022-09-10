class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int count=0;
        while(xor>0)
        {
            int rem = xor%2;
            if(rem==1)
            {
                count++;
            }
            xor/=2;
        }
        return count;
    }
}

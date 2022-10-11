class Solution {
    public int smallestEvenMultiple(int n) {
         int k=0;
        if(n%2==0)
        {
            k=n;
        }
        else
        {
            k=n*2;
        }
        return k;

    }
}

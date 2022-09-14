class Solution {
    public boolean isPalindrome(int x) {
        int n = x,rev=0;
        while(n>0)
        {
            int rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return (rev==x)?true:false;
    }
}

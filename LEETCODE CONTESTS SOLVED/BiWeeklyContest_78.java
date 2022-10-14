//2269. Find the K-Beauty of a Number
class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int c=0;
        for(int i=0;i<str.length()-k+1;i++)
        {
            String s = str.substring(i,i+k);
            int n = Integer.parseInt(s);
            if(n==0)
                continue;
            if(num%n==0)
                c++;
        }
        return c;
    }
}

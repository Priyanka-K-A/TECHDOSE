//2138. Divide a String Into Groups of Size k
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int arrlen=0,rem=0;
        if(len%k==0)
        {
            arrlen = len/k;
        }
        else if(len%k!=0)
        {
            rem = k-(len%k);   
            arrlen = len/k+1;
        }
        for(int i=0;i<rem;i++)
            s+=fill;
        String[] newArr = new String[arrlen];
        int j=0;
        for(int i=0;i<s.length()-k+1;i+=k)
        {
            String str = s.substring(i,i+k);
            newArr[j++] = str;
        }
        return newArr;
    }
}

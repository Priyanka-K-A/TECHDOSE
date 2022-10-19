//2433. Find The Original Array of Prefix Xor
class Solution {
    public int[] findArray(int[] pref) {
        int len = pref.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            if(i==0)
            {
                arr[i] = pref[i];
            }
            else
            {
                arr[i] = pref[i-1]^pref[i];
            }
        }
        return arr;
    }
}

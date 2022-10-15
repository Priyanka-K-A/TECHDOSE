//2108. Find First Palindromic String in the Array
class Solution {
    public String firstPalindrome(String[] words) {
        int len = words.length;
        String str="";
        for(int i=0;i<len;i++)
        {
            String s = "";
            for(int j=words[i].length()-1;j>=0;j--)
            {
                s += words[i].charAt(j);
            }
            if(words[i].equals(s))
            {
                str+=s;break;
            }
        }
        return str;
    }
}

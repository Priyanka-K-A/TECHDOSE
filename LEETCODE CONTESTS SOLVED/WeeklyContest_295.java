//2287. Rearrange Characters to Make Target String
class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] string = new int[26];
        int[] trgt = new int[26];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            string[s.charAt(i)-'a']++;
        }
        for(int i=0;i<target.length();i++)
        {
            trgt[target.charAt(i)-'a']++;
        }
        for(int i=0;i<target.length();i++)
        {
            min = Math.min(min,(string[target.charAt(i)-'a'])/(trgt[target.charAt(i)-'a']));
        }
        return min;
    }
}

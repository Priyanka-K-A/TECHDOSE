class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int i=0,max=0,del=0;
        HashSet<Character> set = new HashSet<>();
        while(i<len)
        {
            if(!(set.contains(s.charAt(i))))
            {
                set.add(s.charAt(i));
                i++;
                max = Math.max(max,set.size());
            }
            else
            {
                set.remove(s.charAt(del));
                del++;
            }
        }
        return max;
    }
}

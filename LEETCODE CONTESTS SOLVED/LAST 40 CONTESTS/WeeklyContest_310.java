//2405. Optimal Partition of String
class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int i=0,count=0;
        while(i<s.length())
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
            }
            else
            {
                count++;
                set.clear();
                set.add(s.charAt(i));
            }
            i++;
        }
        return count+1;
    }
}

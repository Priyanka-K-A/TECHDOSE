class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] p_hash = new int[26];
        int[] s_hash = new int[26];
        if(s.length()<p.length())
            return list;
        for(int i=0;i<p.length();i++)
        {
            p_hash[p.charAt(i)-'a']++;
            s_hash[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(p_hash,s_hash))
            list.add(0);
        int i=0,j=p.length();
        while(j<s.length())
        {
            s_hash[s.charAt(i)-'a']--;
            s_hash[s.charAt(j)-'a']++;
            if(Arrays.equals(p_hash,s_hash))
            {
                list.add(i+1);
            }
            i++;
            j++;
        }
        return list;
    }
}

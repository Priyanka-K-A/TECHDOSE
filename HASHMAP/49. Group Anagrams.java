class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++) 
        {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(map.containsKey(s))
            {
                map.get(s).add(strs[i]);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(s,list);
            }
        }
        for(Map.Entry<String,List<String>> e : map.entrySet())
        {
            res.add(e.getValue());
        }
        return res;
    }
}

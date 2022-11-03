class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        List<Character>[] arr = new List[s.length()+1];
        for(char ch:map.keySet())
        {
            int freq = map.get(ch);
            if(arr[freq]==null)
                arr[freq] = new ArrayList<>();
            arr[freq].add(ch);
        }
        String str = "";
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=null)
            {
                for(char ch:arr[i])
                {
                    for(int j=0;j<i;j++)
                    {
                        str+=ch;
                    }
                }
            }
        }
        return str;
    }
}

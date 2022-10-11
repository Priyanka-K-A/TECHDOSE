//2325. Decode the Message
class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map = new HashMap<>();
        char ch = 'a';
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                if(!map.containsKey(key.charAt(i)))
                {
                    map.put(key.charAt(i),ch);
                    ch++;
                }
            }
        }
        String res="";
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)==' ')
            {
                res+=' ';
            }
            else
            {
                res += (map.get(message.charAt(i)));
            }
        }
        return res;
    }
}

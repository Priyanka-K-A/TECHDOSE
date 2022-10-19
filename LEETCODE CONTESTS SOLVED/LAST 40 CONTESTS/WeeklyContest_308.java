//2390. Removing Stars From a String
class Solution {
    public String removeStars(String s) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
                list.remove(list.size()-1);
            else
                list.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:list)
            sb.append(ch);
        return sb.toString();
    }
}

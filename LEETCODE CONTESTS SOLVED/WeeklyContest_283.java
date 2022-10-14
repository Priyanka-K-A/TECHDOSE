//2194. Cells in a Range on an Excel Sheet
class Solution {
    public List<String> cellsInRange(String s) {
        char s1 = s.charAt(0);
        char s2 = s.charAt(3);
        int n1 = Character.getNumericValue(s.charAt(1));
        int n2 = Character.getNumericValue(s.charAt(4));
        String str="";
        List<String> list = new ArrayList<>();
        for(char ch = s1;ch<=s2;ch++)
        {
            for(int j=n1;j<=n2;j++)
            {
                str="";
                str+=ch;
                str+=Integer.toString(j);
                list.add(str);
            }
        }
        return list;
    }
}

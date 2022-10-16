//2000. Reverse Prefix of Word
class Solution {
    public String reversePrefix(String word, char ch) {
        String str="";
        int k=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                String s = word.substring(0,i+1);
                StringBuffer sb = new StringBuffer(s);
                str += sb.reverse().toString();
                k=i;
                break;
            }
        }
        if(str!="")
            k+=1;
        for(int i=k;i<word.length();i++)
        {
            str+=word.charAt(i);
        }
        return (str=="")?word:str;
        
    }
}

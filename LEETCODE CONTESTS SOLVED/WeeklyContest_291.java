//2259. Remove Digit From Number to Maximize Result
class Solution {
    public String removeDigit(String number, char digit) {
        String res ="";
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)==digit)
            {
                String str = number.substring(0,i)+number.substring(i+1);
                if(str.compareTo(res)>0)
                    res = str;
            }
        }
        return res;
    }
}

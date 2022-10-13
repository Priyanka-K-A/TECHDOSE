//2299. Strong Password Checker II
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int len = password.length();
        int lower=0,upper=0,digit=0,special=0,repeat=0;
        for(int i=0;i<len;i++)
        {
            if(password.charAt(i)>='A' && password.charAt(i)<='Z')
               upper=1;
            else if(password.charAt(i)>='a' && password.charAt(i)<='z')
                lower=1;
            else if(Character.isDigit(password.charAt(i)))
                digit=1;
            else if(password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'||password.charAt(i)=='$'||password.charAt(i)=='%'||password.charAt(i)=='^'||password.charAt(i)=='&'||password.charAt(i)=='*'||password.charAt(i)=='('||password.charAt(i)==')'||password.charAt(i)=='-'||password.charAt(i)=='+')
                special=1;
        }
        Character prev = null;
        for (char ch : password.toCharArray()) {
            if(prev==null)
                prev=ch;
            else if(prev==ch)
            {
                repeat=1;break;  
            }
            else
                prev=ch;
        }
        if(len>=8 && upper==1 && lower==1 && digit==1 && special==1 && repeat==0)
            return true;
        return false;
    }
}

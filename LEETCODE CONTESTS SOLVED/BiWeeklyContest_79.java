//2283. Check if Number Has Equal Digit Count and Digit Value
class Solution {
    public boolean digitCount(String num) {
        int[] count = new int[10];
        int flag=0;
        for(int i=0;i<num.length();i++)
        {
            count[num.charAt(i)-'0']++;
        }
        for(int i=0;i<num.length();i++)
        {
            int val = num.charAt(i)-'0';
            count[i] = count[i]-val;
        }
        for(int i=0;i<10;i++)
        {
            if(count[i]!=0)
                flag=1;
        }
        return(flag==1)?false:true;
        
    }
}

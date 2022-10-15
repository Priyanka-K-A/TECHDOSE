//2042. Check if Numbers Are Ascending in a Sentence
class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int n=0;
        for(String i:arr)
        {
            if(Character.isDigit(i.charAt(0)))
            {
                int val = Integer.parseInt(i);
                if(val<=n)
                    return false;
                n = val;
            }
        }
        return true;
        
    }
}

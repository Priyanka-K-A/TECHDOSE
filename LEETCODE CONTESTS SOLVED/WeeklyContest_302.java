//2341. Maximum Number of Pairs in Array
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101];
        int pairs=0,unpairs=0;
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        for(int i=0;i<=100;i++)
        {
            if(count[i]%2==0)
            {
                pairs += count[i]/2;
            }
            else
            {
                pairs += count[i]/2;
                unpairs += count[i]%2;
            }
        }
        arr[0] = pairs;
        arr[1] = unpairs;
        return arr;
        
    }
}

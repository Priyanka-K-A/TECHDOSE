//2404. Most Frequent Even Element
class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] count = new int[100001];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                count[nums[i]]++;
            }
        }
        int max=0;
        for(int i=0;i<100001;i++)
        {
            if(count[i]>max)
            {
                max = count[i];
                k = i;
            }
        }
        if(max==0)
        {
            return -1;
        }
        return k;
    }
}

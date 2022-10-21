//2348. Number of Zero-Filled Subarrays
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        int i=0;
        while(i<nums.length)
        {
            int c = 0;
            if(nums[i]==0)
            {
                while(i<nums.length && nums[i]==0)
                {
                    c++;
                    i++;
                }
                count+=((long)c*((long)(c+1)))/2;
            }
            i++;
        }
        return count;
    }
}

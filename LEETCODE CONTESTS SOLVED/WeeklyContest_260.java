//2016. Maximum Difference Between Increasing Elements
class Solution {
    public int maximumDifference(int[] nums) {
        int diff=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j] && i<j)
                {
                    diff = nums[j]-nums[i];
                }
                if(diff>max)
                {
                    max = diff;
                }
            }
            
        }
        return (max!=0)?max:-1;
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int sum=0,j=0,max=Integer.MAX_VALUE;
        for(int i=0;i<len;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                sum-=nums[j];
                max = Math.min(max,i-j+1);
                j++;
            }
        }
        return (max!=Integer.MAX_VALUE)?max:0;
    }
}

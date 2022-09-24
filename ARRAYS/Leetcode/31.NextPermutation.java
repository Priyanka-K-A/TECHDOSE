class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if(len<=1)
            return;
        int max = -1;
        for(int i=1;i<len;i++)
        {
            if(nums[i]>nums[i-1])
            {
                max = i;
            }
        }
        if(max==-1)
        {
            Arrays.sort(nums);
            return;
        }
        int index = max;
        for(int i=max;i<len;i++)
        {
            if(nums[i]<nums[index] && nums[i]>nums[max-1])
            {
                index = i;
            }
        }
            int temp = nums[max-1];
            nums[max-1] = nums[index];
            nums[index] = temp;
            Arrays.sort(nums,max,len);
    }
}

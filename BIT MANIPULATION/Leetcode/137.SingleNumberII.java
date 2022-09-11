class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)
        {
            return nums[0];
        }
        else if(nums[0]!=nums[1])
        {
            return nums[0];
        }
        for(int i=1;i<nums.length;i+=3)
        {
            if(nums[i]!=nums[i-1])
            {
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}

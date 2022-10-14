//2239. Find Closest Number to Zero
class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int closest = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(Math.abs(nums[i])<min)
            {
                min = Math.abs(nums[i]);
                closest = nums[i];
            }
            else if(Math.abs(nums[i])==min)
            {
                closest = Math.max(nums[i],closest);
            }
        }
        return closest;
    }
}

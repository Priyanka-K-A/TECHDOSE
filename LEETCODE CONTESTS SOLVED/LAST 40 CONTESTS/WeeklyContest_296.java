//2294. Partition Array Such That Maximum Difference Is K
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=1;
        int a = 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[a]>k)
            {
                count++;
                a = i;
            }
        }
        return count;
    }
}

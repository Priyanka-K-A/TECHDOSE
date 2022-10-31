class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] sum = new int[nums.length+1];
        int c=0;
        sum[0]=0;
        for(int i=0;i<nums.length;i++)
        {
            sum[i+1] = sum[i]+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int diff = sum[j+1]-sum[i];
                if(diff==k)
                    c++;
            }
        }
        return c;
    }
}

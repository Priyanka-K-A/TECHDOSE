// 2342. Max Sum of a Pair With Equal Sum of Digits
class Solution {
    public int digitsum(int n)
    {
        int tot=0;
        while(n>0)
        {
            tot+=(n%10);
            n/=10;
        }
        return tot;
    }
    public int maximumSum(int[] nums) {
        int[] sum = new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            sum[i] = digitsum(nums[i]);
        }
        int val=0,max=0,flag=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.println(sum[i]);
        // }
        for(int i=0;i<sum.length;i++)
        {
            for(int j=i+1;j<sum.length;j++)
            {
                if(sum[i]==sum[j])
                {
                    val = nums[i]+nums[j];
                    flag=1;
                    break;
                }
            }
            if(val>max)
            {
                max = val;
            }
        }
        return (flag==0)?-1:max;
    }
}

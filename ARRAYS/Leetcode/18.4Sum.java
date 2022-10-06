class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list  = new ArrayList<>();
        int len = nums.length;
        if(len<4)
            return list;
        for(int i=0;i<=len-4;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            for(int j=i+1;j<=len-3;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])
                {
                    continue;
                }
                int left = j+1,right = len-1;
                while(left<right)
                {
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target)
                    {
                        List<Integer> newList = new ArrayList<>();
                        newList.add(nums[i]);
                        newList.add(nums[j]);
                        newList.add(nums[left]);
                        newList.add(nums[right]);
                        if(!list.contains(newList))
                        {
                            list.add(newList);
                        }
                        left++;
                    }
                    else if(sum>target)
                    {
                        right--;
                    }
                    else
                    {
                        left++;
                    }
                } 
            }
        }
        return list;
    }
}

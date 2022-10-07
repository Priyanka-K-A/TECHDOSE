class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();   
        for(int i=0;i<len;i++)
        {
            while(i>0 && i<len && nums[i]==nums[i-1])
            {
                i++;
            }
            int left = i+1;
            int right = len-1;
            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0)
                {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(nums[i]);
                    newList.add(nums[left]);
                    newList.add(nums[right]);
                    
                    left++;
                    while(left<right && nums[left]==nums[left-1])
                    {
                        left++;
                    }
                    list.add(newList);
                    
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return list;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int c = nums.length/2;
        for(int i:nums)
        {
            int count=0;
            for(int j:nums)
            {
                if(i==j)
                {
                    count+=1;
                }
            }
            if(count > c)
            {
               return i;
            }
        }
        return -1;
    }
}

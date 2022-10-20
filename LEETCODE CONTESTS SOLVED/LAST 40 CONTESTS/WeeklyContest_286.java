//2216. Minimum Deletions to Make Array Beautiful
class Solution {
    public int minDeletion(int[] nums) {
        int i = 0,c = 0;
        while(i<nums.length && (i+1)<nums.length)
        {
            if(nums[i]!=nums[i+1])
                i+=2;
            else
            {
                i++;
                c++;
            }
        }
        return((nums.length-c)%2==0)?c:c+1;
        
    }
}

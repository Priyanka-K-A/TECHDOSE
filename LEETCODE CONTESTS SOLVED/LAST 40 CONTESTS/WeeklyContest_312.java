//2419. Longest Subarray With Maximum Bitwise AND
class Solution {
    public int longestSubarray(int[] nums) {
        int len = nums.length;
        int arr;
        int[] dup = new int[len];
        for(int i=0;i<len;i++)
        {
            dup[i] = nums[i];
        }
        Arrays.sort(dup);
        int max = dup[len-1];
        int count=0;
        for(int i=0;i<len;i++)
        {
            arr=0;
            while(i<len && nums[i]==max)
            {
                 arr++;
                 i++;
            }
            count = Math.max(count,arr);
        }
        return count;
        
    }
}

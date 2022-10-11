//2389. Longest Subsequence With Limited Sum
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] arr = new int[queries.length];
        int len1 = nums.length;
        int len2 = queries.length;
        Arrays.sort(nums);
        for(int i=0;i<len2;i++)
        {
            int c=0;
            int val=0;
            for(int j=0;j<len1;j++)
            {
                val+=nums[j];
                if(val>queries[i])
                {
                    val-=nums[j];
                }
                else
                {
                    c++;
                }
            }
            arr[i] = c;
        }
        return arr;
    }
}

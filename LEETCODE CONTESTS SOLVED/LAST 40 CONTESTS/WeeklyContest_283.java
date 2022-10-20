//2195. Append K Integers With Minimal Sum
class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        long sum=0;
        for(int i:nums)
        {
            if(!set.contains(i) && i<=k)
            {
                k++;
                sum+=i;
            }
            set.add(i);
        }
        long tot = (long)k*(k+1)/2-sum;
        return tot;
    }
}

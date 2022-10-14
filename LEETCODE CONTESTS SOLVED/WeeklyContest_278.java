//2154. Keep Multiplying Found Values by Two
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==original)
                original *=2;
            if(nums[i]>original)
                break;
        }
        return original;
    }
}

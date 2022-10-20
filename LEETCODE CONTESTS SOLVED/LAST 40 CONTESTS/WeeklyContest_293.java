//2274. Maximum Consecutive Floors Without Special Floors
class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max=0,sum = bottom-1;
        for(int i:special)
        {
            max = Math.max(max,i-sum-1);
            sum = i;
        }
        max = Math.max(max,top-special[special.length-1]);
        return max;
        
    }
}

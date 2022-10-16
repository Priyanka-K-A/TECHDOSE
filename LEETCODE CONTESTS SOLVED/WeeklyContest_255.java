//1979. Find Greatest Common Divisor of Array
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
        return gcd(a,b);
        
    }
    static int gcd(int a,int b)
    {
        return (b==0)?a:(gcd(b,a%b));
    }
}

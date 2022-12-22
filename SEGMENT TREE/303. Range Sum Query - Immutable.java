class NumArray {
    int result[];
    public NumArray(int[] nums) {
        result=new int[nums.length];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            result[i]=result[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
        {
            return result[right];
        }
        return result[right]-result[left-1];
    }
}

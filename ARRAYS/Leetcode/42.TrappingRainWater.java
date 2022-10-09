class Solution {
    public int trap(int[] height) {
        int len = height.length;
        if(len<=2)
            return 0;
        int[] left = new int[len];
        int[] right = new int[len];
        int leftMax = height[0];
        int rightMax = height[len-1];
        left[0] = 0;
        right[0] = 0;
        for(int i=1;i<len;i++)
        {
            left[i] = leftMax;
            if(height[i]>leftMax)
            {
                leftMax = height[i];
            }
        }
        for(int i=len-2;i>=0;i--)
        {
            right[i] = rightMax;
            if(height[i]>rightMax)
            {
                rightMax = height[i];
            }
        }
        int water=0;
        for(int i=1;i<len-1;i++)
        {
           if((Math.min(left[i],right[i]))-height[i]>0)
           {
               water+=((Math.min(left[i],right[i]))-height[i]);
           }
        }
        return water;
    }
}

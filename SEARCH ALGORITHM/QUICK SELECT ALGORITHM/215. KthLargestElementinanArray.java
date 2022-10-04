class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int low=0,high = n-1;
        quickselect(nums,low,high,k);
        return nums[k-1];
    }
    public static void quickselect(int[] nums,int low,int high,int k)
    {
        if(low<high)
        {
            int part = partition(nums,low,high);
            if(part+1==k)
            {
                return;
            }
            else if(k<=part)
            {
                quickselect(nums,low,part-1,k);
            }
            else
            {
                quickselect(nums,part+1,high,k);
            }
        }
    }
    public static int partition(int[] nums,int low,int high)
    {
        int i = low-1;
        int pivot = nums[high];
        for(int j=low;j<high;j++)
        {
            if(nums[j]>pivot)
            {
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums,i+1,high);
        return i+1;
    }
    public static void swap(int[] nums,int low,int high)
    {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}

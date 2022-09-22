class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        double[] arr = new double[l1+l2];
        int k=0;
        for(int i=0;i<l1;i++)
        {
            arr[k++] = Double.valueOf(nums1[i]);
        }
        for(int i=0;i<l2;i++)
        {
            arr[k++] = Double.valueOf(nums2[i]);
        }
        Arrays.sort(arr);
        int l3 = arr.length;
        Double res = 0.0;
        if(l3%2!=0)
        {
            res = arr[l3/2];
        }
        else
        {
            res = (arr[(l3/2)]+arr[(l3/2-1)])/2;
        }
        return res;
    }
}

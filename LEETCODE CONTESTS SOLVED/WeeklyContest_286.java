//2215. Find the Difference of Two Arrays
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> newList1 = new ArrayList<>();
        List<Integer> newList2 = new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(!newList1.contains(nums2[i]))
                newList1.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(!newList2.contains(nums1[i]))
                newList2.add(nums1[i]);
            if(newList1.contains(nums1[i]))
            {
                newList1.remove(new Integer(nums1[i]));
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(newList2.contains(nums2[i]))
            {
                newList2.remove(new Integer(nums2[i]));
            }
        }
        list.add(newList2);
        list.add(newList1);
        return list;
                
    }
}

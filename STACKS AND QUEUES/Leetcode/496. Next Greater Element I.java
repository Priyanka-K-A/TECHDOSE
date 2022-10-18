class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums2)
        {
            while(!s.isEmpty() && i>s.peek())
            {
                map.put(s.pop(),i);
            }
            s.add(i);
        }
        int[] arr = new int[nums1.length];
        int i=0;
        for(int num:nums1)
        {
            arr[i++] = map.getOrDefault(num,-1);
        }
        return arr;
    }
}

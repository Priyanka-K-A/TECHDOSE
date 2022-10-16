//2032. Two Out of Three
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();
        
        for(int i:nums1)
            s1.add(i);
        for(int i:nums2)
            s2.add(i);
        for(int i:nums3)
            s3.add(i);
        
        for(int i:s1)
            if(s2.contains(i))
                list.add(i);
        
        for(int i:s2)
            if(s3.contains(i) && !s1.contains(i))
                list.add(i);
        
        for(int i:s3)
            if(s1.contains(i) && !s2.contains(i))
                list.add(i);
            
        return list;   
        
    }
}

//2210. Count Hills and Valleys in an Array
class Solution {
    public int countHillValley(int[] nums) {
        int len = nums.length;
        int c=0;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<len;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                list.add(nums[i]);
            }
        }
        System.out.println(list);
        for(int i=1;i<list.size()-1;i++)
        {
            if((list.get(i)<list.get(i+1) && list.get(i)<list.get(i-1))||(list.get(i)>list.get(i+1) && list.get(i)>list.get(i-1)))
            {
                // System.out.println(list.get(i-1)+" "+list.get(i)+" "+list.get(i+1));
                c++;
            }
        }
        return c;
        
    }
}

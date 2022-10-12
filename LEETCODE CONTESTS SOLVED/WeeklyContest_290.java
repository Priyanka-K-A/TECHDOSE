// 2248. Intersection of Multiple Arrays
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int row = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] count = new int[1001];
        for(int i=0;i<row;i++)
        {
            int col = nums[i].length;
            for(int j=0;j<col;j++)
            {
                count[nums[i][j]]++;
            }
        }
        for(int i=1;i<1001;i++)
        {
            if(count[i]==row)
            {
                list.add(i);
            }
                
        }
        return list;
    }
}

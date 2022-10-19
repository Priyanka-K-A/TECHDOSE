//2352. Equal Row and Column Pairs
class Solution {
    public int equalPairs(int[][] grid) {
        int c=0;
        int[][] trans = new int[grid[0].length][grid.length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                trans[i][j] = grid[j][i];
            }
        }
        for(int i[]:grid)
        {
            for(int j[]:trans)
            {
                if(Arrays.equals(i,j))
                    c++;
            }
                
        }
        return c;
    }
}

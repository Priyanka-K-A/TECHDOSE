//2373. Largest Local Values in a Matrix
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int row = grid.length;
        int[][] mat = new int[row-2][row-2];
        int col = mat.length;
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<col;j++)
            {
                int max = Integer.MIN_VALUE;
                for(int x=i;x<i+3;x++)
                {
                    for(int y=j;y<j+3;y++)
                    {
                        max = Math.max(max,grid[x][y]);
                    }
                }
                mat[i][j] = max;
            }
                       
        }
        return mat;
    }
}

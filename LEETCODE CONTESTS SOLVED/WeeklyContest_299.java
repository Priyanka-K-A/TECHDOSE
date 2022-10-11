//2319. Check if Matrix Is X-Matrix
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int flag=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j||j==row-i-1)
                {
                    if(grid[i][j]==0)
                    {
                        flag=1;
                        break;
                    }
                }
                else
                {
                    if(grid[i][j]!=0)
                    {
                        flag=1;
                        break;
                    }
                }
            }
        }
        return (flag==0)?true:false;
        
    }
}

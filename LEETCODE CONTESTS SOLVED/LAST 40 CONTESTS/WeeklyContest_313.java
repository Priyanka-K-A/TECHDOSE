//2428. Maximum Sum of an Hourglass
class Solution {
    public int maxSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sum =0,max=0;
       for(int i=0;i<row-2;i++)
        {
            for(int j=1;j<col-1;j++)
            {
                sum = grid[i][j]+grid[i][j-1]+grid[i][j+1]+grid[i+1][j]+grid[i+2][j]+grid[i+2][j-1]+grid[i+2][j+1];
                if(sum > max)
                {
                    max = sum;
                }
            }
        }
        return max;
    }
}

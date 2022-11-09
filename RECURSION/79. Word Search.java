class Solution {
        
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] vis = new boolean[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(dfs(board,vis,i,j,word,0,row,col))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,boolean[][]vis,int i,int j,String word,int index,int row,int col)
    {
        if(index==word.length())
            return true;
        if(i<0||j<0||i>=row||j>=col||vis[i][j]==true||board[i][j]!=word.charAt(index))
            return false;
        vis[i][j]=true;
        boolean left = dfs(board,vis,i,j-1,word,index+1,row,col);
        boolean right = dfs(board,vis,i,j+1,word,index+1,row,col);
        boolean top = dfs(board,vis,i-1,j,word,index+1,row,col);
        boolean bottom = dfs(board,vis,i+1,j,word,index+1,row,col);
        vis[i][j] = false;
        if(left||right||top||bottom)
            return true;
        else
            return false;
    }
}

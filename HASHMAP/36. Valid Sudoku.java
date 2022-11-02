class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(set.contains(board[i][j]+"r"+i)||set.contains(board[i][j]+"c"+j)||set.contains(board[i][j]+"b"+i/3+j/3))
                    {
                        return false;
                    }
                    set.add(board[i][j]+"r"+i);
                    set.add(board[i][j]+"c"+j);
                    set.add(board[i][j]+"b"+i/3+j/3);
                }
            }
        }
        return true;
    }
}

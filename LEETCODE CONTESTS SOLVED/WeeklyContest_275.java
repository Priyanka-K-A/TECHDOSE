//2133. Check if Every Row and Column Contains All Numbers
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        
        int flag=0;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> rowset = new HashSet<>();
            for(int j=0;j<n;j++)
            {
                if(!rowset.contains(matrix[i][j]))
                    rowset.add(matrix[i][j]);
            }
            if(rowset.size()!=n)
                return false;
        }
        
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> colset = new HashSet<>();
            for(int j=0;j<n;j++)
            {
                if(!colset.contains(matrix[j][i]))
                    colset.add(matrix[j][i]);
            }
            if(colset.size()!=n)
                return false;
        }
        return true;
    }
}

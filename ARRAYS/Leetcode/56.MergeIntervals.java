class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        int[][] mat = new int[len][2];
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        if(len==1)
            return intervals;
        int k=0;
        if(intervals[1][0]<=intervals[0][1])
        {
            mat[k][0] = Math.min(intervals[0][0],intervals[1][0]);
            mat[k][1] = Math.max(intervals[0][1],intervals[1][1]);
            k++;
        }
        else
        {
            mat[k][0]=intervals[0][0];
            mat[k][1]=intervals[0][1];
            k++;
        }
        for(int i=1;i<len;i++)
        {
            if(intervals[i][0]<=mat[k-1][1])
            {
                mat[k-1][0]=Math.min(mat[k-1][0],intervals[i][0]);
                mat[k-1][1]=Math.max(mat[k-1][1],intervals[i][1]);
            }
            else
            {
                mat[k][0] = intervals[i][0];
                mat[k][1] = intervals[i][1];
                k++;
            }
        }
        int[][] res = new int[k][2];
        for(int i=0;i<k;i++)
        {
            res[i][0] = mat[i][0];
            res[i][1] = mat[i][1];
        }
        return res;
    }
}

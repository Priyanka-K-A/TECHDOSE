class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int time=0,max=0,index=0;
        int row = logs.length;
        int col = logs[0].length;
        for(int i=0;i<row;i++)
        {
            if(i==0)
            {
                time = logs[0][1];
            }
            else
            {
                time = logs[i][1] - logs[i-1][1];
            }
            // System.out.print(time+" "+i+"--"+logs[i][0]);
            if(time == max)
            {
                max = time;
                if(index > logs[i][0])
                {
                    index = logs[i][0];
                }
            }
            else if(time>max && time!=max)
            {
                max = time;
                index = logs[i][0];
            }
            // System.out.print("  I:"+index+"----"+logs[i][0]);
            // System.out.println();
            
        }
        return index;
        
    }
}
